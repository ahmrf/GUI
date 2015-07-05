import javax.swing.*;
import java.awt.*;


/**
 * Created by ahmrf on 7/5/2015.
 */
public class FlowLayoutFrame extends JFrame {
    private JButton leftButton;
    private JButton centerButton;
    private JButton rightButton;
    private FlowLayout layout;
    private Container container;

    public FlowLayoutFrame() {
        super("FlowLayout Demo");

        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        leftButton = new JButton("Left");
        add(leftButton);
        leftButton.addActionListener(
                e -> {
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
        );

        centerButton = new JButton("Center");
        add(centerButton);
        centerButton.addActionListener(
                e -> {
                    layout.setAlignment(FlowLayout.CENTER);
                    layout.layoutContainer(container);
                }
        );

        rightButton = new JButton("Right");
        add(rightButton);
        rightButton.addActionListener(
                e -> {
                    layout.setAlignment(FlowLayout.RIGHT);
                    layout.layoutContainer(container);
                }
        );
    }
}
