package home3;

import javax.swing.*;

public class MyButton extends JButton {

    public MyButton(String name) {
        super(name);
    }

    public MyButton(String name, int width, int height) {
        this(name);
        super.setSize(width, height);
    }
}
