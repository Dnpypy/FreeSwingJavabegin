package home4.listeners;

import com.jtattoo.plaf.smart.SmartLookAndFeel;
import home4.gui.MyFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChangeSkinActionListener implements ActionListener {

    private MyFrame frame;
    private SmartLookAndFeel laf;

    public ChangeSkinActionListener(MyFrame frame, SmartLookAndFeel laf) {
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
            Logger.getLogger(ChangeSkinActionListener.class.getName()).log(Level.SEVERE, null, ex);
        }

        SwingUtilities.updateComponentTreeUI(frame);

    }
}
