import javax.swing.*;
import java.awt.*;

public class TestGui {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Test Frame");
        frame.setSize(900, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        FlowLayout f1 = new FlowLayout();
        frame.setLayout(f1);

        JButton button = new JButton("Test Button");
        frame.add(button);

    }
}
