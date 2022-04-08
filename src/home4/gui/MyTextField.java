package home4.gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class MyTextField extends JTextField {

    public MyTextField(String name, int columns) {
        this(columns);
        super.setText(name);
    }

    public MyTextField(int columns) {
        super.setColumns(columns);
        Font font = new Font("Courier", Font.ITALIC, 12);
        super.setFont(font);
        super.setForeground(Color.GRAY);
    }

    public MyTextField(int columns, Color textColor) {
        super.setColumns(columns);
        Font font = new Font("Courier", Font.ITALIC, 12);
        super.setFont(font);
        super.setForeground(textColor);
    }
}
