package home3;

import javax.swing.*;
import java.awt.*;

public class JTextFieldHome extends JTextField {

    public JTextFieldHome(String text, int width) {
        this(width);
        super.setText(text);
    }

    public JTextFieldHome(int width) {
        super.setColumns(width);
        Font font = new Font("Courier", Font.ITALIC, 12);
        super.setFont(font);
        super.setForeground(Color.GRAY);
    }

    public JTextFieldHome(int width, Color textColor) {
        super.setColumns(width);
        Font font = new Font("Courier", Font.ITALIC, 12);
        super.setFont(font);
        super.setForeground(textColor);
    }
}
