import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ahmrf on 7/2/2015.
 */
public class ButtonFrame extends JFrame {
    private JButton plainButton, fancyButton;

    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());

        plainButton = new JButton("Plain button");
        add(plainButton);
        Icon icon1 = new ImageIcon(getClass().getResource("glare.jpg"));
        Icon icon2 = new ImageIcon(getClass().getResource("image.jpg"));
        fancyButton = new JButton("Fancy button",icon2);
        fancyButton.setRolloverIcon(icon1);
        add(fancyButton);

        ButtonHandler buttonHandler = new ButtonHandler();
        fancyButton.addActionListener(buttonHandler);
        plainButton.addActionListener(buttonHandler);

    }

    private class ButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", e.getActionCommand()));
        }
    }
}
