package home3;

import javax.swing.*;
import java.awt.*;

public class JFrameHome extends JFrame {

    public JFrameHome(String title, int width, int height) {
        super(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        super.setIconImage(new ImageIcon("icon.png").getImage());
    }

    public JFrameHome(String name, int width, int height, Component comp) {
        this(name, width, height);
        super.getContentPane().add(comp);
    }

    public JFrameHome(String title, int width, int height, LayoutManager manager) {
        super(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLayout(manager);
        super.setIconImage(new ImageIcon("icon.png").getImage());
    }
}
