package listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

public class ButtonListener extends MouseAdapter implements ActionListener {

    private JPanel panel;

    public ButtonListener(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() instanceof JButton) {
            JButton button = (JButton) event.getSource();
            if (button.getText().equals("Button1")) {
                System.out.println("OutClass from " + button.getText());

            } else {
                JOptionPane.showMessageDialog(panel, "OutClass from " + button.getText());
            }

        }
    }
}
