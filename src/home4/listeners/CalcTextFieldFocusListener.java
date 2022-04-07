package home4.listeners;

import home4.gui.MyTextField;
import layoutsdemo.TestGui;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class CalcTextFieldFocusListener implements FocusListener {

    // работаем с одним полем
    private MyTextField textField;

    public CalcTextFieldFocusListener(MyTextField textField) {
        this.textField = textField;
    }


    /**
     * переход курсора в это место или табом
     * @param e текстовое окно активно. здесь идет проверка
     * Если текст в этом поле наша константа ВВЕДИТЕ ЧИСЛО,
     * то мы ее убираем и указываем, что текст нашего введеного сообщения будет черный
     */
    @Override
    public void focusGained(FocusEvent e) {
        if(textField.getText().trim().equals(TestGui.INPUT_CHISLO)){
            textField.setText(""); // убирает текст
            textField.setForeground(Color.BLACK); // когда вводим числа цвет черный
        }
    }

    /**
     * Если курсор вне поля, то происходит проверка, если поле пустое то, поле заполняется текстом
     * введите число и применяем цвет серый
     * @param e событие
     */
    @Override
    public void focusLost(FocusEvent e) {
        if(textField.getText().trim().equals("")){
            textField.setText(TestGui.INPUT_CHISLO);
            textField.setForeground(Color.GRAY); // когда висит текст серый для ввода
        }
    }
}
