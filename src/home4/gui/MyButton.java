package home4.gui;

import javax.swing.*;

public class MyButton extends JButton {

    public MyButton(String name) {
        super.setText(name);
    }

    public MyButton(String title, int width, int height) {
        this(title);
        super.setSize(width, height);
    }
}
