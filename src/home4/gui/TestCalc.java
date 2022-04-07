package home4.gui;

import com.jtattoo.plaf.smart.SmartLookAndFeel;
import home4.listeners.CalcTextFieldFocusListener;
import home4.listeners.CalcButtonActionListener;


import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCalc {

    public static final String INPUT_CHISLO = "введите число";

    private MyButton btnAdd;
    private MyButton btnSubtract;
    private MyButton btnDivide;
    private MyButton btnMultiply;

    private JLabel labelChislo1;
    private JLabel labelChislo2;
    private JLabel labelResult;

    private MyTextField jtxtChislo1;
    private MyTextField jtxtChislo2;
    private MyTextField jtxtResult;

    private MyPanel panel1;
    private MyPanel panel2;
    private MyPanel panel3;

    private MyFrame frame;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new SmartLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TestCalc.class.getName()).log(Level.SEVERE, null, ex);
        }

        JFrame.setDefaultLookAndFeelDecorated(true);

        TestCalc testGUI = new TestCalc();

        testGUI.createLabels();
        testGUI.createTextFields();
        testGUI.createButtons();
        testGUI.createPanels();
        testGUI.createFrame();

    }

    //<editor-fold defaultstate="collapsed" desc="create GUI components">
    private void createLabels() {
        labelChislo1 = new JLabel("Число 1");
        labelChislo2 = new JLabel("Число 2");
        labelResult = new JLabel("Результат");
    }

    private void createTextFields() {
        jtxtChislo1 = new MyTextField(INPUT_CHISLO, 10);
        jtxtChislo2 = new MyTextField(INPUT_CHISLO, 10);

        jtxtResult = new MyTextField(15, Color.RED);
        jtxtResult.setEditable(false);
        jtxtResult.setFocusable(false);

        addTextFieldListeners();

    }

    private void createButtons() {
        btnAdd = new MyButton("Сложение");
        btnSubtract = new MyButton("Вычитание");
        btnDivide = new MyButton("Деление");
        btnMultiply = new MyButton("Умножение");

        addButtonListeners();
    }

    private void createPanels() {
        panel1 = new MyPanel("panel1", 100, 100);
        panel1.setPreferredSize(new Dimension(200, 50));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel2 = new MyPanel("panel2", 100, 100);
        panel2.setPreferredSize(new Dimension(200, 50));
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel3 = new MyPanel("panel3", 100, 100);
        panel3.setPreferredSize(new Dimension(200, 50));
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel1.add(labelChislo1);
        panel1.add(jtxtChislo1);
        panel1.add(labelChislo2);
        panel1.add(jtxtChislo2);

        panel2.add(btnAdd);
        panel2.add(btnSubtract);
        panel2.add(btnMultiply);
        panel2.add(btnDivide);

        panel3.add(labelResult);
        panel3.add(jtxtResult);

    }

    private void createFrame() {
        frame = new MyFrame("Калькулятор", 430, 200, new BorderLayout(2, 2));
        frame.setMinimumSize(new Dimension(430, 200));

        frame.setResizable(false);

        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);
        frame.getContentPane().add(panel3, BorderLayout.SOUTH);

        frame.setVisible(true);

    }

    private void addButtonListeners() {
        CalcButtonActionListener bl = new CalcButtonActionListener(jtxtChislo1, jtxtChislo2, jtxtResult);

        btnAdd.addActionListener(bl);
        btnSubtract.addActionListener(bl);
        btnMultiply.addActionListener(bl);
        btnDivide.addActionListener(bl);
    }

    private void addTextFieldListeners() {
        jtxtChislo1.addFocusListener(new CalcTextFieldFocusListener(jtxtChislo1));
        jtxtChislo2.addFocusListener(new CalcTextFieldFocusListener(jtxtChislo2));
    }
}
    

