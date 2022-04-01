package home2;

import javax.swing.*;
import java.awt.*;

public class JPanelHome extends JPanel {

    public JPanelHome(String title, int width, int height) {
        super.setSize(width, height);
        super.setName(title);
        super.setBorder(BorderFactory.createEtchedBorder());
    }

    public JPanelHome(String name, int width, int height, Component comp) {
        this(name, width, height);
        super.add(comp);
    }

    public JPanelHome(String name, int width, int height, Component comp1, Component comp2) {
        this(name, width, height);
        super.add(comp1);
        super.add(comp2);
    }

    public JPanelHome(String name, int width, int height, LayoutManager layoutManager) {
        this(name, width, height);
        super.setLayout(layoutManager);
    }

    public JPanelHome(String name, int width, int height, LayoutManager layoutManager, Component comp) {
        this(name, width, height);
        super.setLayout(layoutManager);
        super.add(comp);
    }
}
