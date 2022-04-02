package home3;

import com.jtattoo.plaf.smart.SmartLookAndFeel;

import javax.swing.*;
import java.awt.*;

public class TestGui {

    private JButtonHome btnAdd;
    private JButtonHome btnSubtract;
    private JButtonHome btnDivide;
    private JButtonHome btnMultiply;

    private JLabel labelNumber1;
    private JLabel labelNumber2;
    private JLabel labelResult;

    private JTextFieldHome jtxtNumber1;
    private JTextFieldHome jtxtNumber2;
    private JTextFieldHome jtxtResult;

    private JPanelHome panel1;
    private JPanelHome panel2;
    private JPanelHome panel3;

    //private JFrameHome frame;
    private JDialogHome frame;

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

    private void createLabels() {
        labelNumber1 = new JLabel("Число1");
        labelNumber2 = new JLabel("Число2");
        labelResult = new JLabel("Результат");
    }

    private void createTextFields() {
        jtxtNumber1 = new JTextFieldHome(10);
        jtxtNumber2 = new JTextFieldHome(10);

        jtxtResult = new JTextFieldHome(15, Color.RED);
        jtxtResult.setEditable(false);
        jtxtResult.setFocusable(false);

    }

    private void createButtons() {
        btnAdd = new JButtonHome("Сложение");
        btnSubtract = new JButtonHome("Вычитание");
        btnDivide = new JButtonHome("Деление");
        btnMultiply = new JButtonHome("Умножение");
    }

    private void createPanels() {
        panel1 = new JPanelHome("panel1", 100,100 );
        panel1.setPreferredSize(new Dimension(200, 50));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel2 = new JPanelHome("panel2", 100,100 );
        panel2.setPreferredSize(new Dimension(200, 50));
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel3 = new JPanelHome("panel3", 100,100 );
        panel3.setPreferredSize(new Dimension(200, 50));
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel1.add(labelNumber1);
        panel1.add(jtxtNumber1);
        panel1.add(labelNumber2);
        panel1.add(jtxtNumber2);

        panel2.add(btnAdd);
        panel2.add(btnSubtract);
        panel2.add(btnDivide);
        panel2.add(btnMultiply);

        panel3.add(labelResult);
        panel3.add(jtxtResult);
    }

    private void createFrame() {
        frame = new JDialogHome("Калькулятор", 430, 200, new BorderLayout(2, 2));
        frame.setMinimumSize(new Dimension(430, 200));

        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);
        frame.getContentPane().add(panel3, BorderLayout.SOUTH);

        frame.setVisible(true);
    }


}
