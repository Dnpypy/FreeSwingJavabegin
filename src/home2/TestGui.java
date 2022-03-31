package home2;

import javax.swing.*;

public class TestGui {

    public static void main(String[] args) {
        JButton button = new JButton("Button");

        JPanelHome panelHome = new JPanelHome("Panel", 100, 100, button);

        JFrameHome frameHome = new JFrameHome("Frame", 200, 200, panelHome);
    }


}
