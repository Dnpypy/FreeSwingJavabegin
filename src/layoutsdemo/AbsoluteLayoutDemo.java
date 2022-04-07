package layoutsdemo;


import home4.listeners.CalcButtonActionListener;

import javax.swing.*;
import java.awt.*;


public class AbsoluteLayoutDemo extends LayoutDefaultButtons {

    private JPanel panel;


    @Override
    public void useLayout(JPanel panel) {
        panel.setLayout(null);
    }

    @Override
    public void addButtonsToPanel(final JPanel panel, int buttonCount) {

        this.panel = panel;

        JButton button1 = new JButton("Button1");
        button1.setSize(300, 300);
        button1.setBounds(new Rectangle(150, 200, 170, 20));

        // home4 1 вариант анонимный класс
        // при нажатии на кнопку 1 отбработается ActionListener()
        // что будет происходить по нажатию этой кнопки
        //
        //button1.addActionListener(new CalcButtonActionListener(panel));


        JButton button2 = new JButton("Button2");
        button2.setBounds(new Rectangle(100, 100, 150, 30));

        //button2.addActionListener(new CalcButtonActionListener(panel));


        panel.add(button1);
        panel.add(button2);
    }


}
