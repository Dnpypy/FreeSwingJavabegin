package home3;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    public MyPanel(String name, int width, int height) {
        super.setSize(width, height);
        super.setName(name);
        super.setBorder(BorderFactory.createEtchedBorder());
    }

    public MyPanel(String name, int width, int height, Component component) {
        this(name, width, height);
        super.add(component);
    }

    public MyPanel(String name, int width, int height, LayoutManager manager) {
        this(name, width, height);
        super.setLayout(manager);
    }

    public MyPanel(String name, int width, int height, LayoutManager manager, Component component) {
        this(name, width, height);
        super.setLayout(manager);
        super.add(component);
    }
}
