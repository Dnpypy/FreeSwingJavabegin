package home2;

import com.jtattoo.plaf.smart.SmartLookAndFeel;

import javax.swing.*;

public class TestGui {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {

        UIManager.setLookAndFeel(new SmartLookAndFeel());

        JFrame.setDefaultLookAndFeelDecorated(true);

        JButton button1 = new JButton("Button");
        JButton button2 = new JButton("Button");

        JPanelHome panelHome = new JPanelHome("Panel", 100, 100, button1, button2);

        JFrameHome frameHome = new JFrameHome("Frame", 200, 200, panelHome);
    }


}
