package layoutsdemo;

import com.jtattoo.plaf.smart.SmartLookAndFeel;
import home4.gui.MyButton;
import home4.gui.MyFrame;
import home4.gui.MyPanel;
import home4.gui.MyTextField;
import home4.listeners.CalcButtonActionListener;
import home4.listeners.CalcTextFieldFocusListener;

import javax.swing.*;
import java.awt.*;

public class TestGui {

    public static final String INPUT_CHISLO = "введите число";

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

        testGui.createButton();
        testGui.createLabel();
        testGui.createTextField();
        testGui.createPanel();
        testGui.createFrame();

    }

    private void createFrame() {
        frame = new MyFrame("Калькулятор", 430, 200, new BorderLayout(2, 2));
        frame.setMinimumSize(new Dimension(430, 200));

        frame.setResizable(false);

        frame.getContentPane().add(panel1,BorderLayout.NORTH);
        frame.getContentPane().add(panel2,BorderLayout.CENTER);
        frame.getContentPane().add(panel3,BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void createPanel() {
        panel1 = new MyPanel("panel1", 100, 100);
        panel1.setPreferredSize(new Dimension(200, 50));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel2 = new MyPanel("panel2", 100, 100);
        panel2.setPreferredSize(new Dimension(200, 50));
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel3 = new MyPanel("panel2", 100, 100);
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

    private void createTextField() {
        jtxtNumber1 = new MyTextField(INPUT_CHISLO, 10);
        jtxtNumber2 = new MyTextField(INPUT_CHISLO,10);

        jtxtResult = new MyTextField(15, Color.red);
        jtxtResult.setEditable(false);
        jtxtResult.setFocusable(false);

        addTextFieldListener();
    }

    private void createLabel() {
        labelNumber1 = new JLabel("Цифра1");
        labelNumber2 = new JLabel("Цифра2");

        labelResult = new JLabel("Результат");
    }

    private void createButton() {
        btnAdd = new MyButton("Сложение");
        btnSubtract = new MyButton("Вычитание");
        btnDivide = new MyButton("Деление");
        btnMultiply = new MyButton("Умножение");

        addButtonListener();
    }

    /**
     * При создании слушателя события при нажатии кнопки создаем объект класса CalcButtonActionListener
     */
    private void addButtonListener(){
        CalcButtonActionListener bl = new CalcButtonActionListener(jtxtNumber1, jtxtNumber2, jtxtResult);

        btnAdd.addActionListener(bl);
        btnSubtract.addActionListener(bl);
        btnDivide.addActionListener(bl);
        btnMultiply.addActionListener(bl);

    }

    /**
     * Для каждого текстового поля создаем отдельный экземпляр класса CalcTextFieldFocusListener
     * и в него передаем текущее текстовое поле с которым мы работаем
     */
    private void addTextFieldListener(){
        jtxtNumber1.addFocusListener(new CalcTextFieldFocusListener(jtxtNumber1));
        jtxtNumber2.addFocusListener(new CalcTextFieldFocusListener(jtxtNumber2));
    }
}
