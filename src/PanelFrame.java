import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import java.awt.*;

/**
 * Created by ahmrf on 7/5/2015.
 */
public class PanelFrame extends JFrame {
    private JPanel buttonPanel;
    private JButton[] buttons;

    public PanelFrame() {
        super("Panel Demo");

        buttons = new JButton[5];
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, buttons.length));
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Button" + (i + 1));
            buttonPanel.add(buttons[i]);
        }

        add(buttonPanel, BorderLayout.SOUTH);
    }
}
