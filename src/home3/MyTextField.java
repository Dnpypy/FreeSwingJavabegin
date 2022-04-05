package home3;

import javax.swing.*;
import java.awt.*;

public class MyTextField extends JTextField {

    public MyTextField(String name, int width) {
        this(width);
        super.setName(name);
    }

    public MyTextField(int width) {
        super.setColumns(width);
        Font font = new Font("Courier", Font.ITALIC, 12);
        super.setFont(font);
        super.setForeground(Color.GRAY);
    }

    public MyTextField(int width, Color textColor) {
        super.setColumns(width);
        Font font = new Font("Courier", Font.ITALIC, 12);
        super.setFont(font);
        super.setForeground(textColor);
    }
}
