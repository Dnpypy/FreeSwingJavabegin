package home3;

import com.jtattoo.plaf.smart.SmartLookAndFeel;

import javax.swing.*;
import java.awt.*;

public class TestGui {

    private MyButton btnAdd;
    private MyButton btnSubtract;
    private MyButton btnDivide;
    private MyButton btnMultiply;

    private JLabel labelNumber1;
    private JLabel labelNumber2;
    private JLabel labelResult;

    private MyTextField jtxtNumber1;
    private MyTextField jtxtNumber2;
    private MyTextField jtxtResult;

    private MyPanel panel1;
    private MyPanel panel2;
    private MyPanel panel3;

    private MyFrame frame;

    public static void main(String[] args) throws UnsupportedLookAndFeelException {

        UIManager.setLookAndFeel(new SmartLookAndFeel());

        JFrame.setDefaultLookAndFeelDecorated(true);

        TestGui testGui = new TestGui();

        testGui.createLabels();
        testGui.createTextFields();
        testGui.createButtons();
        testGui.createPanels();
        testGui.createFrame();
    }

    private void createFrame() {
        frame = new MyFrame("Калькулятор", 430, 200, new BorderLayout(2, 2));
        frame.setMinimumSize(new Dimension(430, 200));

        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);
        frame.getContentPane().add(panel3, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void createPanels() {
        panel1 = new MyPanel("panel1", 100,100 );
        panel1.setPreferredSize(new Dimension(200, 50));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel2 = new MyPanel("panel2", 100,100 );
        panel2.setPreferredSize(new Dimension(200, 50));
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel3 = new MyPanel("panel3", 100,100 );
        panel3.setPreferredSize(new Dimension(200, 50));
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel1.add(labelNumber1);
        panel1.add(jtxtNumber1);
        panel1.add(labelNumber2);
        panel1.add(jtxtNumber2);

        panel2.add(btnAdd);
        panel2.add(btnSubtract);
        panel2.add(btnMultiply);
        panel2.add(btnDivide);

        panel3.add(labelResult);
        panel3.add(jtxtResult);
    }

    private void createButtons() {
        btnAdd = new MyButton("Сложение");
        btnSubtract = new MyButton("Вычитание");
        btnDivide = new MyButton("Деление");
        btnMultiply = new MyButton("Умножение");
    }

    private void createTextFields() {
        jtxtNumber1 = new MyTextField(10);
        jtxtNumber2 = new MyTextField(10);

        jtxtResult = new MyTextField(15, Color.RED);
        jtxtResult.setEditable(false);
        jtxtResult.setFocusable(false);
    }

    private void createLabels() {
        labelNumber1 = new JLabel("Число1");
        labelNumber2 = new JLabel("Число2");
        labelResult = new JLabel("Результат");
    }


}
