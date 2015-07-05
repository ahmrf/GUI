import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by ahmrf on 7/4/2015.
 */
public class ComboBoxFrame extends JFrame {
    private JComboBox jComboBox;
    private JLabel jLabel;

    private static final String[] names = {"red", "green", "blue", "yellow"};
    private Icon[] icons = {
            new ImageIcon(getClass().getResource("red.jpg")),
            new ImageIcon(getClass().getResource("green.jpg")),
            new ImageIcon(getClass().getResource("blue.jpg")),
            new ImageIcon(getClass().getResource("yellow.jpg"))
    };

    public ComboBoxFrame() {
        super("Testing JComboBox");
        setLayout(new FlowLayout());

        jComboBox = new JComboBox(names);
        jComboBox.setMaximumRowCount(3);
        jComboBox.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            jLabel.setIcon(icons[jComboBox.getSelectedIndex()]);
                        }
                    }
                }
        );
        add(jComboBox);
        jLabel = new JLabel(icons[0]);
        add(jLabel);
    }
}
