import javax.swing.*;

public class TestGui {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Test Frame");
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        JButton jButton = new JButton("Test Button");
        jFrame.add(jButton);
    }
}
