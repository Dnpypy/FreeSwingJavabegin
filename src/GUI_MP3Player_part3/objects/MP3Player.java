package GUI_MP3Player_part3.objects;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import GUI_MP3Player_part3.gui.MP3PlayerGui;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

// класс для проигрывания mp3 файлов
public class MP3Player {

    private final BasicPlayer player = new BasicPlayer();

    private String currentFileName; //текущая песня

    private double currentVolumevalue; //текущий уровень звука

    public void play(String fileName) {

        try {
            if (currentFileName != null && currentFileName.equals(fileName) && player.getStatus() == BasicPlayer.PAUSED) {
                player.resume();
                return;
            }
            currentFileName = fileName;
            player.open(new File(fileName));
            player.play();
            player.setGain(currentVolumevalue); // устанавливаем уровень звука

        } catch (BasicPlayerException e) {
            java.util.logging.Logger.getLogger(MP3Player.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }

    public void stop() {
        try {
            player.stop();
        } catch (BasicPlayerException e) {
            java.util.logging.Logger.getLogger(MP3Player.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }

    public void pause() {
        try {
            player.pause();
        } catch (BasicPlayerException e) {
            java.util.logging.Logger.getLogger(MP3Player.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }

    public void setVolume(int currentValue, int maximumValue) {
        try {
            this.currentVolumevalue = currentValue;
            if (currentValue == 0) {
                player.setGain(0);
            } else {
                player.setGain(calcVolume(currentValue, maximumValue));
            }
        } catch (BasicPlayerException e) {
            java.util.logging.Logger.getLogger(MP3Player.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }

    // подсчитать значение звука исходя из значений компонента регулировки звука (JSlider)
    private double calcVolume(int currentValue, int maximumValue) {
        currentVolumevalue = (double) currentValue / (double) maximumValue;
        return currentVolumevalue;
    }


    public void seek(long l) {
        try {
            player.seek(1028469);
        } catch (BasicPlayerException ex) {
            Logger.getLogger(MP3Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
