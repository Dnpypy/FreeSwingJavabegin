package layoutsdemo;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class AbsoluteLayoutDemo extends LayoutDefaultButtons{
    
    //....


    @Override
    public void useLayout(JPanel panel) {
        panel.setLayout(null);
    }

    @Override
    public void addButtonsToPanel(final JPanel panel, int buttonCount) {
        
        //....

        JButton button1 = new JButton("Button1");
        button1.setSize(300,300);
        button1.setBounds(new Rectangle(150,200,170,20));
        
        // home4 1 вариант анонимный класс
        // при нажатии на кнопку 1 отбработается ActionListener()
        // что будет происходить по нажатию этой кнопки
        //
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(panel, "text message");
            }
        });
        
                
        JButton button2 = new JButton("Button2");
        button2.setBounds(new Rectangle(100,100,150,30));
        
        panel.add(button1);
        panel.add(button2);
        
        
        
    }
    
   

}
