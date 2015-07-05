import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

/**
 * Created by ahmrf on 7/4/2015.
 */
public class PaintPanel extends JPanel {
    private int pointCount = 0;
    private Point[] points = new Point[10000];

    public PaintPanel() {
        addMouseMotionListener(
                new MouseMotionAdapter() {
                    @Override
                    public void mouseDragged(MouseEvent e) {
                        if (pointCount < points.length) {
                            points[pointCount] = e.getPoint();
                            ++pointCount;
                            repaint();
                        }
                    }
                }
        );
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(int i = 0; i < pointCount; i++) {
            g.fillOval(points[i].x, points[i].y, 4, 4);
        }
    }
}
