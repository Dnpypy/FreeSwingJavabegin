package home1;

import javax.swing.*;
import java.awt.*;


/**
 * 1. Изменить пример: добавить на фрейм панель JPanel и перенести на него кнопку
 */
public class HomeTestGui {

    public static void main(String[] args) {

        JButton button = new JButton("Button");
        button.setSize(300, 200);


        JPanel panel = new JPanel();
        panel.setSize(400, 400);
        panel.setVisible(true);
        FlowLayout flowLayout2 = new FlowLayout();
        panel.setLayout(flowLayout2);
        panel.add(button);

        JFrame frame = new JFrame("Test Frame");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        FlowLayout flowLayout1 = new FlowLayout();
        frame.setLayout(flowLayout1);
        frame.add(panel);
    }
}
