package GUI_MP3Player_OOP.interfaces;

public interface Player {

    void play(String fileName);

    void stop();

    void pause();

    // регулирует звук при проигрывании песни
    void setVolume(double controlValue);

    void jump(double controlPosition);
}
