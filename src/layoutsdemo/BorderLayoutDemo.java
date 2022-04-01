package layoutsdemo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;


public class BorderLayoutDemo extends LayoutDefaultButtons{

    @Override
    public void useLayout(JPanel panel) {
        panel.setLayout(new BorderLayout());
    }

    

    @Override
    public void addButtonsToPanel(JPanel panel, int buttonCount) {
        JButton button = new JButton("Button 1");
        panel.add(button, BorderLayout.NORTH);

        button = new JButton("Button 2");
        panel.add(button, BorderLayout.CENTER);

        button = new JButton("Button 3");
        button.setPreferredSize(new Dimension(200,200));
        panel.add(button, BorderLayout.SOUTH);

        button = new JButton("Button 4");
        panel.add(button, BorderLayout.WEST);

        button = new JButton("Button 5");
        panel.add(button, BorderLayout.EAST);
    }
    
    

}
