package home3;

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

    public JPanelHome(String name, int width, int height, LayoutManager manager) {
        this(name, width, height);
        super.setLayout(manager);
    }

    public JPanelHome(String name, int width, int height, LayoutManager manager, Component comp){
            this(name, width, height);
            super.setLayout(manager);
            super.add(comp);

    }

}
