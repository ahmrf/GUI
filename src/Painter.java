import javax.swing.*;
import java.awt.*;

/**
 * Created by ahmrf on 7/4/2015.
 */
public class Painter {
    public static void main(String[] args) {
        JFrame application = new JFrame("A simple paint program");
        PaintPanel paintPanel = new PaintPanel();
        application.add(paintPanel);
        application.add(new JLabel("Drag the mouse to draw"), BorderLayout.SOUTH);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(400, 200);
        application.setVisible(true);
    }
}
