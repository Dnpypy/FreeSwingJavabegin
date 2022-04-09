package home5.listeners;


import home4.gui.TestCalculator;
import home5.gui.MyFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChangeSkinActionListener implements ActionListener {

    private MyFrame frame;
    private LookAndFeel laf;

    public ChangeSkinActionListener(MyFrame frame, LookAndFeel laf) {
        this.frame = frame;
        this.laf = laf;
    }

    /**
     * этот метод как раз занимается перерисовкой всех компонентов
     * @param e событие
     * изменение скина программы
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            UIManager.setLookAndFeel(laf);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TestCalculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        SwingUtilities.updateComponentTreeUI(frame);
    }

}
