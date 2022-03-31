package home1;

import javax.swing.*;

public class JButtonHome extends JButton {

    public JButtonHome(String title) {
        super.setText(title);
    }

    public JButtonHome(String title, int width, int height) {
        this(title);
        super.setSize(width, height);
    }

}
