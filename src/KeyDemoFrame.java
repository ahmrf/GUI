import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by ahmrf on 7/5/2015.
 */
public class KeyDemoFrame extends JFrame implements KeyListener {
    private String line1 = "";
    private String line2 = "";
    private String line3 = "";
    private JTextArea jTextArea;

    public KeyDemoFrame() {
        super("Demonstrating Keystroke Events");

        jTextArea = new JTextArea(10, 15);
        jTextArea.setText("Press any key on the keyboard...");
        jTextArea.setEnabled(false);
        jTextArea.setDisabledTextColor(Color.BLACK);
        add(jTextArea);

        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        line1 = String.format("Key pressed: %s", KeyEvent.getKeyText(e.getKeyCode()));
        setLines2and3(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        line1 = String.format("Key released: %s", KeyEvent.getKeyText(e.getKeyCode()));
        setLines2and3(e);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        line1 = String.format("Key typed: %s", e.getKeyChar());
        setLines2and3(e);
    }

    private void setLines2and3 (KeyEvent keyEvent) {
        line2 = String.format("This key is %san action key", keyEvent.isActionKey()? "":"not");
        String temp = KeyEvent.getKeyModifiersText(keyEvent.getModifiers());

        line3 = String.format("Modifier keys pressed: %s", temp.equals("")? "none": temp);
        jTextArea.setText(String.format("%s\n%s\n%s\n", line1, line2, line3));
    }
}
