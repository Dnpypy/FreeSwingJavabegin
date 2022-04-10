package home5.gui;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import javax.swing.ImageIcon;

public class MyFrame extends JFrame {

    private Image icon = new ImageIcon("/images/icon.png").getImage();

    public MyFrame(String name, int width, int height) {
        super(name);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        super.setIconImage(icon);
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
        super.setIconImage(icon);
    }

}
