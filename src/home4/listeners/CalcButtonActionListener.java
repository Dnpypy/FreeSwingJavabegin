package home4.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButtonActionListener implements ActionListener {

    private JPanel panel;

    public CalcButtonActionListener(JPanel panel) {
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
