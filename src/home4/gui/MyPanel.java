package home4.gui;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    public MyPanel(String name, int width, int height) {
        super.setName(name);
        super.setSize(width, height);
        setBorder(BorderFactory.createEtchedBorder());
    }

    public MyPanel(String name, int width, int height, Component component) {
        this(name, width, height);
        super.add(component);
    }

    public MyPanel(String name, int width, int height, LayoutManager layoutManager) {
        this(name, width, height);
        super.setLayout(layoutManager);
    }

    public MyPanel(String name, int width, int height, LayoutManager layoutManager, Component component) {
        this(name, width, height);
        super.setLayout(layoutManager);
        super.add(component);
    }
}
