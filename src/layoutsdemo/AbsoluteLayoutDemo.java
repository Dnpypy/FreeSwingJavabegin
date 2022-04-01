package layoutsdemo;

import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JPanel;


public class AbsoluteLayoutDemo extends LayoutDefaultButtons{
    
    private JPanel panel;

    @Override
    public void useLayout(JPanel panel) {
        panel.setLayout(null);
    }

    @Override
    public void addButtonsToPanel(final JPanel panel, int buttonCount) {
        
        this.panel = panel;
        JButton button1 = new JButton("Button1");
        button1.setSize(300,300);
        button1.setBounds(new Rectangle(150,200,170,20));
        
     
        
                
        JButton button2 = new JButton("Button2");
        button2.setBounds(new Rectangle(100,100,150,30));
        
        panel.add(button1);
        panel.add(button2);
        
        
        
    }
    
   

}
