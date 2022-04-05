package home3;

import javax.swing.*;
import java.awt.*;

public class MyDialog extends JDialog {

    public MyDialog(String title, int width, int height) {
        super.setTitle(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setVisible(true);
        super.setLayout(new FlowLayout());

        // нельзя так делать!
//        super.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
    }

    public MyDialog(String title, int width, int height, Component comp) {
        this(title, width, height);
        super.getContentPane().add(comp);

    }

    public MyDialog(String title, int width, int height, LayoutManager layout) {
        super.setTitle(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
//        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(layout);
        super.setIconImage(new ImageIcon("icon.png").getImage());
    }
}
