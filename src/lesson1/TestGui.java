package lesson1;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;

public class TestGui {
    public static void main(String[] args) throws UnsupportedLookAndFeelException {

        UIManager.setLookAndFeel(new MetalLookAndFeel());

        JFrame.setDefaultLookAndFeelDecorated(true);


        JFrame frame = new JFrame("Test Frame");
        frame.setIconImage(new ImageIcon("c:\\temp\\icon.png").getImage());
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        JButton button = new JButton("Button");
        button.setSize(300, 200);
        frame.add(button);

        JPanel panel = new JPanel(flowLayout);
        panel.setSize(300, 300);
        panel.add(button);
        panel.setBorder(BorderFactory.createRaisedBevelBorder());

        frame.getContentPane().add(panel);
    }
}
