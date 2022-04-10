package home5.gui;

import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import home5.listeners.CalcButtonActionListener;
import home5.listeners.CalcTextFieldFocusListener;
import home5.listeners.ChangeSkinActionListener;
import net.infonode.gui.laf.InfoNodeLookAndFeel;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCalculatorAddSkin {

    public final static String INPUT_NUMBER = "Введите число";

    private MyButton btnAdd;
    private MyButton btnSubtract;
    private MyButton btnDivide;
    private MyButton btnMultiply;

    private MyButton btnChangeSkin;
    private MyButton btnDefaultSkin;

    private JLabel labelNumber1;
    private JLabel labelNumber2;
    private JLabel labelResult;

    private MyTextField jtxtNumber1;
    private MyTextField jtxtNumber2;
    private MyTextField jtxtResult;

    private MyPanel panel1;
    private MyPanel panel2;
    private MyPanel panel3;
    //private MyPanel panel4;

    private MyFrame frame;

    public static void main(String[] args) {

        try {
           UIManager.setLookAndFeel(new BernsteinLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TestCalculatorAddSkin.class.getName()).log(Level.SEVERE, null, ex);
        }
        JFrame.setDefaultLookAndFeelDecorated(true);

        TestCalculatorAddSkin calculator = new TestCalculatorAddSkin();

        calculator.createLabels();
        calculator.createTextFields();
        calculator.createButtons();
        calculator.createPanels();
        calculator.createFrame();
    }

    private void createFrame() {
        frame = new MyFrame("Калькулятор", 430, 200, new BorderLayout(2, 2));
        frame.setMinimumSize(new Dimension(430,200));

        frame.setResizable(false);

        //все панели добавляю на фрейм
        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);
        frame.getContentPane().add(panel3, BorderLayout.SOUTH);

        addChangeSkinListeners();

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

//        panel4 = new MyPanel("panel4", 100,100 );
//        panel4.setPreferredSize(new Dimension(200, 50));
//        panel4.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel1.add(labelResult);
        panel1.add(jtxtResult);
        panel1.add(btnChangeSkin);
        panel1.add(btnDefaultSkin);


        panel2.add(labelNumber1);
        panel2.add(jtxtNumber1);
        panel2.add(labelNumber2);
        panel2.add(jtxtNumber2);

        panel3.add(btnAdd);
        panel3.add(btnSubtract);
        panel3.add(btnMultiply);
        panel3.add(btnDivide);

    }

    private void createTextFields() {
        jtxtNumber1 = new MyTextField(INPUT_NUMBER, 10);
        jtxtNumber2 = new MyTextField(INPUT_NUMBER, 10);

        jtxtResult = new MyTextField(15, Color.RED);
        jtxtResult.setEditable(false);
        jtxtResult.setFocusable(false);

        addTextFieldsListeners();
    }

    private void createLabels() {
        labelNumber1 = new JLabel("Число1");
        labelNumber2 = new JLabel("Число2");
        labelResult = new JLabel("Результат");
    }

    private void createButtons() {
        btnAdd = new MyButton("Сложение");
        btnSubtract = new MyButton("Вычитание");
        btnDivide = new MyButton("Деление");
        btnMultiply = new MyButton("Умножение");

        btnChangeSkin = new MyButton("Скин 1");
        btnDefaultSkin = new MyButton("Скин 2");

        addButtonListeners();
    }

    private void addButtonListeners(){
        CalcButtonActionListener listener = new CalcButtonActionListener(jtxtNumber1,  jtxtNumber2, jtxtResult);

        btnAdd.addActionListener(listener);
        btnSubtract.addActionListener(listener);
        btnDivide.addActionListener(listener);
        btnMultiply.addActionListener(listener);
    }

    private void addTextFieldsListeners() {
        jtxtNumber1.addFocusListener(new CalcTextFieldFocusListener(jtxtNumber1));
        jtxtNumber2.addFocusListener(new CalcTextFieldFocusListener(jtxtNumber2));
    }

    private void addChangeSkinListeners(){
        btnChangeSkin.addActionListener(new ChangeSkinActionListener(frame, new InfoNodeLookAndFeel()));
        btnDefaultSkin.addActionListener(new ChangeSkinActionListener(frame, new BernsteinLookAndFeel()));


    }

}
