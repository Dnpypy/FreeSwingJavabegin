package home2;

import javax.swing.*;
import java.awt.*;

public class JFrameHome extends JFrame {

    public JFrameHome(String name, int width, int height) {
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        super.setVisible(true);
    }

    public JFrameHome(String name, int width, int height, Component comp) {
        this(name, width, height);
        super.getContentPane().add(comp);

    }
}
