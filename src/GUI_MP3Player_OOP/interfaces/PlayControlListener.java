package GUI_MP3Player_OOP.interfaces;

public interface PlayControlListener {
    void playStarted(String name);

    void processScroll(int position);

    void playFinished();
}
