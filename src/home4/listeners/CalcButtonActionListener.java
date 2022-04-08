package home4.listeners;

import home4.calc.CalcOperations;
import java.awt.event.ActionEvent;
import javax.swing.*;

import home4.gui.MyTextField;
import java.awt.event.ActionListener;

public class CalcButtonActionListener implements ActionListener {

    private MyTextField textField1;
    private MyTextField textField2;
    private MyTextField textResult;

    public CalcButtonActionListener(MyTextField textField1, MyTextField textField2, MyTextField textResult) {
        this.textField1 = textField1;
        this.textField2 = textField2;
        this.textResult = textResult;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (!(event.getSource() instanceof JButton)) {
            return;
        }

        JButton btn = (JButton) event.getSource();

        //  тут самостоятельная задача, перехват ошибки NumberFormatException:,
        // когда пользователь вводит пустоту или текст

        try {
            //это число
            final double a = Double.parseDouble(textField1.getText());
            final double b = Double.parseDouble(textField2.getText());

            if (btn.getActionCommand().equals("Сложение")) {
                textResult.setText(String.valueOf(CalcOperations.add(a, b)));
            } else if (btn.getActionCommand().equals("Вычитание")) {
                textResult.setText(String.valueOf(CalcOperations.subtract(a, b)));
            } else if (btn.getActionCommand().equals("Деление")) {
                textResult.setText(String.valueOf(CalcOperations.divide(a, b)));
            } else if (btn.getActionCommand().equals("Умножение")) {
                textResult.setText(String.valueOf(CalcOperations.multiply(a, b)));
            }

        } catch(NumberFormatException e){
            //это явно не число
            JOptionPane.showMessageDialog(textField1, " Введите число!!");
            return;
        }

    }

}
