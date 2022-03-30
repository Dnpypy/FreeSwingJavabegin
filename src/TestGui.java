import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class TestGui {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Test Frame");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        JButton button = new JButton("Button");
        button.setSize(300, 200);
        frame.add(button);


    }
}
