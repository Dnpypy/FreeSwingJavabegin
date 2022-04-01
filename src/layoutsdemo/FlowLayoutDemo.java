package layoutsdemo;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import javax.swing.JPanel;


public class FlowLayoutDemo extends LayoutDefaultButtons{


    @Override
    public void useLayout(JPanel panel) {
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel.setLayout(new FlowLayout());
        
    }

    
    
}
