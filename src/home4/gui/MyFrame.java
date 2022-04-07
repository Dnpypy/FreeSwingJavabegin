package home4.gui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String name, int width, int height) {
        super(name);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        super.setIconImage(new ImageIcon("icon.png").getImage());
    }

    public MyFrame(String name, int width, int height, Component component) {
        this(name, width, height);
        super.getContentPane().add(component);
    }

    public MyFrame(String name, int width, int height, LayoutManager layoutManager) {
        super(name);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLayout(layoutManager);
        super.setIconImage(new ImageIcon("icon.png").getImage());
    }

}
