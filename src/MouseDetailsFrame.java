import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by ahmrf on 7/4/2015.
 */
public class MouseDetailsFrame extends JFrame {
    private String details;
    private JLabel statusBar;

    public MouseDetailsFrame() {
        super("Mouse clicks and buttons");

        statusBar = new JLabel("Click the mouse");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler());
    }

    private class MouseClickHandler extends MouseAdapter{
        public void mouseClicked(MouseEvent mouseEvent) {
            int x = mouseEvent.getX();
            int y = mouseEvent.getY();

            details = String.format("Clicked %d time(s)", mouseEvent.getClickCount());

            if(mouseEvent.isMetaDown()) {
                details += " with right mouse button";
            } else if(mouseEvent.isAltDown()) {
                details += " with center mouse button";
            } else {
                details += " with left mouse button";
            }

            statusBar.setText(details);
        }
    }
}
