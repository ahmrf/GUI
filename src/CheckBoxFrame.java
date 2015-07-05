import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by ahmrf on 7/2/2015.
 */
public class CheckBoxFrame extends JFrame {
    private JTextField jTextField;
    private  JCheckBox boldJCheckBox, italicJCheckBox;

    public CheckBoxFrame() {
        super("JCheckBox Test");
        setLayout(new FlowLayout());

        jTextField = new JTextField("Watch the font style change", 20);
        jTextField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(jTextField);
        boldJCheckBox = new JCheckBox("Bold");
        italicJCheckBox = new JCheckBox("Italic");
        add(boldJCheckBox);
        add(italicJCheckBox);

        CheckBoxHandler checkBoxHandler = new CheckBoxHandler();
        boldJCheckBox.addItemListener(checkBoxHandler);
        italicJCheckBox.addItemListener(checkBoxHandler);

    }

    private class CheckBoxHandler implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            Font font = null;
            if(boldJCheckBox.isSelected() && italicJCheckBox.isSelected()) {
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            } else if(boldJCheckBox.isSelected()) {
                font = new Font("Serif", Font.BOLD, 14);
            } else if(italicJCheckBox.isSelected()) {
                font = new Font("Serif", Font.ITALIC, 14);
            } else {
                font = new Font("Serif", Font.PLAIN, 14);
            }

            jTextField.setFont(font);
        }
    }
}
