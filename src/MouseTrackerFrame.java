import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by ahmrf on 7/4/2015.
 */
public class MouseTrackerFrame extends JFrame {
    private JPanel mousePanel;
    private JLabel statusBar;

    public MouseTrackerFrame() {
        super("Demonstrating Mouse Events");

        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER);

        statusBar = new JLabel("Mouse outside panel");
        add(statusBar, BorderLayout.SOUTH);

        MouseHandler mouseHandler = new MouseHandler();
        mousePanel.addMouseListener(mouseHandler);
        mousePanel.addMouseMotionListener(mouseHandler);
        mousePanel.addMouseMotionListener(mouseHandler);
    }

    private class MouseHandler implements MouseListener, MouseMotionListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            statusBar.setText(String.format("Clicked at [%d, %d]", e.getX(), e.getY()));
        }

        @Override
        public void mousePressed(MouseEvent e) {
            statusBar.setText(String.format("Pressed at [%d, %d]", e.getX(), e.getY()));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            statusBar.setText(String.format("Released at [%d, %d]", e.getX(), e.getY()));
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            statusBar.setText(String.format("Mouse entered at [%d, %d]", e.getX(), e.getY()));
            mousePanel.setBackground(Color.GREEN);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            statusBar.setText(String.format("Dragged at [%d, %d]", e.getX(), e.getY()));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            statusBar.setText("Mouse outside panel");
            statusBar.setBackground(Color.WHITE);
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            statusBar.setText(String.format("Moved at [%d, %d]", e.getX(), e.getY()));
        }
    }
}
