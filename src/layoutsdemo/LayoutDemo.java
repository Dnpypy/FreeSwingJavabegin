package layoutsdemo;

import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class LayoutDemo extends JFrame {
    
    public abstract void addButtonsToPanel(JPanel panel, int buttonCount);
    
    public abstract void useLayout(JPanel panel);
    

    public LayoutDemo() throws HeadlessException {
        createDemo();
    }
    
    private void createDemo() throws HeadlessException {

        JFrame frame = new JFrame("demo");
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setMinimumSize(new Dimension(400,400));
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        useLayout(panel);

        addButtonsToPanel(panel, 10);

        frame.getContentPane().add(panel);
//        frame.pack();
        frame.setVisible(true);
    }



    
}
