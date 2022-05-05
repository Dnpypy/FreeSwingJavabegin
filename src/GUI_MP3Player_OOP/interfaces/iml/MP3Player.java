package GUI_MP3Player_OOP.interfaces.iml;

import GUI_MP3Player_OOP.interfaces.PlayControlListener;
import GUI_MP3Player_OOP.interfaces.Player;
import GUI_MP3Player_OOP.obj.BasicPlayerListenerAdapter;
import GUI_MP3Player_OOP.utils.FileUtils;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerException;

import java.io.File;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MP3Player implements Player {
   // Все поля статичны
    public static final String MP3_FILE_EXTENSION = "mp3";
    public static final String MP3_FILE_DESCRIPTION = "Файлы mp3";
    public static int MAX_VOLUME = 100;

    private long duration; // длительность песни в секундах
    private int bytesLen; // размер песни в байтах


    private BasicPlayer basicPlayer = new BasicPlayer();// используем библиотеку для реализации проигрывания mp3
    private String currentFileName;// текущая песня
    private double currentVolume;

    private long secondsAmount; // сколько секунд прошло с начала проигрывания

    private final PlayControlListener playControlListener;

    public MP3Player(PlayControlListener playControlListener) {
        this.playControlListener = playControlListener;

        basicPlayer.addBasicPlayerListener(new BasicPlayerListenerAdapter() {
            @Override
            public void progress(int bytesread, long microseconds, byte[] pcmdata, Map properties) {

                float progress = -1.0f;

                if ((bytesread > 0) && ((duration > 0))) {
                    progress = bytesread * 1.0f / bytesLen * 1.0f;
                }

                // сколько секунд прошло
                secondsAmount = (long) (duration * progress);

                if (duration != 0) {
                    int length = ((int) Math.round(secondsAmount * 1000 / duration));
                    MP3Player.this.playControlListener.processScroll(length);
                }
            }

            @Override
            public void opened(Object o, Map map) {
                duration = (long) Math.round((((Long) map.get("duration"))) / 1000000);
                bytesLen = (int) Math.round(((Integer) map.get("mp3.length.bytes")));

                // если есть mp3 тег для имени - берем его, если нет - вытаскиваем название из имени файла
                String songName = map.get("title") != null ? map.get("title").toString() : FileUtils.getFileNameWithoutExtension(new File(o.toString()).getName());

                // если длинное название - укоротить его
                if (songName.length() > 30) {
                    songName = songName.substring(0, 30) + "...";
                }

                MP3Player.this.playControlListener.playStarted(songName);

            }

            @Override
            public void stateUpdated(BasicPlayerEvent bpe) {
                int state = bpe.getCode();

                if (state == BasicPlayerEvent.EOM) {
                    MP3Player.this.playControlListener.playFinished();
                }

            }
        });
    }



    @Override
    public void play(String fileName) {

        try {
            // если включают ту же самую песню, которая была на паузе
            if (currentFileName != null && currentFileName.equals(fileName) && basicPlayer.getStatus() == BasicPlayer.PAUSED) {
                basicPlayer.resume();
                return;
            }

            File mp3File = new File(fileName);

            currentFileName = fileName;
            basicPlayer.open(mp3File);
            basicPlayer.play();
            basicPlayer.setGain(currentVolume);

        } catch (BasicPlayerException ex) {
            Logger.getLogger(MP3Player.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private double calcVolume(double currentValue) {
        currentVolume = (double) currentValue / MAX_VOLUME;
        return currentVolume;
    }

    @Override
    public void stop() {
        try {
            basicPlayer.stop();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(MP3Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void setVolume(double controlValue) {
        try {

            currentVolume = calcVolume(controlValue);
            basicPlayer.setGain(currentVolume);

        } catch (BasicPlayerException ex) {
            Logger.getLogger(MP3Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void pause() {
        try {
            basicPlayer.pause();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(MP3Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void jump(double controlPosition) {
        try {
            long skipBytes = (long) Math.round(((Integer) bytesLen) * controlPosition);
            basicPlayer.seek(skipBytes);
            basicPlayer.setGain(currentVolume);
        } catch (BasicPlayerException ex) {
            Logger.getLogger(MP3Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
