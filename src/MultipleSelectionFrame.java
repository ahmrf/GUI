import javax.swing.*;
import java.awt.*;

/**
 * Created by ahmrf on 7/4/2015.
 */
public class MultipleSelectionFrame extends JFrame {
    private JList colorJList;
    private JList copyJList;
    private  JButton copyButton;
    private static final String[] colorNames = { "Black", "Blue", "Cyan",
            "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
            "Orange", "Pink", "Red", "White", "Yellow" };
    public MultipleSelectionFrame() {
        super("Multiple Selection Test");
        setLayout(new FlowLayout());

        colorJList = new JList(colorNames);
        colorJList.setVisibleRowCount(5);
        colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(colorJList));

        copyButton = new JButton("Copy >>> ");
        copyButton.addActionListener(
                e -> copyJList.setListData(colorJList.getSelectedValues())
        );

        add(copyButton);

        copyJList = new JList();
        copyJList.setVisibleRowCount(5);
        copyJList.setFixedCellWidth(100);
        copyJList.setFixedCellHeight(15);
        copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyJList));
    }
}
