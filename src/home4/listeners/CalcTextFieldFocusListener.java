package home4.listeners;

import home4.gui.MyTextField;
import home4.gui.TestCalculator;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class CalcTextFieldFocusListener implements FocusListener {

    private MyTextField textField;

    public CalcTextFieldFocusListener(MyTextField textField) {
        this.textField = textField;
    }

    @Override
    public void focusGained(FocusEvent event) {
        if (textField.getText().trim().equals(TestCalculator.INPUT_NUMBER)) {
            textField.setText("");
            textField.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent event) {
        if (textField.getText().trim().equals("")) {
            textField.setText(TestCalculator.INPUT_NUMBER);
            textField.setForeground(Color.GRAY);
        }
    }
}
