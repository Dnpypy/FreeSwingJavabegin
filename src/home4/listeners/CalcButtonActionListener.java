package home4.listeners;

import home4.calc.CalcOperations;
import home4.gui.MyTextField;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButtonActionListener implements ActionListener {

    private  MyTextField jtxtNumber1;
    private  MyTextField jtxtNumber2;
    private  MyTextField jtxtResult;

    public CalcButtonActionListener(MyTextField jtxtNumber1, MyTextField jtxtNumber2, MyTextField jtxtResult) {
        this.jtxtNumber1 = jtxtNumber1;
        this.jtxtNumber2 = jtxtNumber2;
        this.jtxtResult = jtxtResult;
    }

    /**
     * нажата ли была кнопка вообще, иначе..
     * @param event слушатель события
     * getSource() возращает источник этого события
     */
    @Override
    public void actionPerformed(ActionEvent event) {

        if (!(event.getSource() instanceof JButton)){
            return;
        }

        // нисходящее приведение
        JButton btn = (JButton) event.getSource();

        final double a = Double.parseDouble(jtxtNumber1.getText());
        final double b = Double.parseDouble(jtxtNumber2.getText());


        if (btn.getActionCommand().equals("Сложение")) {
            jtxtResult.setText(String.valueOf(CalcOperations.add(a, b)));
        } else if (btn.getActionCommand().equals("Деление")) {
            jtxtResult.setText(String.valueOf(CalcOperations.divide(a, b)));
        } else if (btn.getActionCommand().equals("Вычитание")) {
            jtxtResult.setText(String.valueOf(CalcOperations.subtract(a, b)));
        } else if (btn.getActionCommand().equals("Умножение")) {
            jtxtResult.setText(String.valueOf(CalcOperations.multiply(a, b)));
        }
    }
}
