package home3;

import javax.swing.*;
import java.awt.*;

public class JDialogHome extends JDialog {
    public JDialogHome(String title, int width, int height) {
        super.setTitle(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
    }

    public JDialogHome(String name, int width, int height, Component comp) {
        this(name, width, height);
        super.getContentPane().add(comp);
    }

    public JDialogHome(String title, int width, int height, LayoutManager manager) {
        super.setTitle(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
//        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLayout(manager);
    }
}
