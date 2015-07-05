import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import java.awt.*;

/**
 * Created by ahmrf on 7/4/2015.
 */
public class ListFrame extends JFrame {
    private JList colorJList;
    private static final String[] colorNames = { "Black", "Blue", "Cyan",
            "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
            "Orange", "Pink", "Red", "White", "Yellow" };
    private static final Color[] colors = { Color.BLACK, Color.BLUE,
            Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
            Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
            Color.RED, Color.WHITE, Color.YELLOW };

    public ListFrame() {
        super("List Test");
        setLayout(new FlowLayout());

        colorJList = new JList(colorNames);
        colorJList.setVisibleRowCount(5);
        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(colorJList));

        colorJList.addListSelectionListener((ListSelectionEvent e) -> getContentPane().setBackground(colors[colorJList.getSelectedIndex()]));

    }
}
