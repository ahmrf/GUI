import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ahmrf on 7/1/2015.
 */
public class TextFieldFrame extends JFrame {
    private  JTextField textField1, textField2, textField3;
    private  JPasswordField passwordField;

    public TextFieldFrame() {
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        textField1 = new JTextField(10);
        add(textField1);

        textField2 = new JTextField("Enter text here");
        add(textField2);

        textField3 = new JTextField("Uneditable text field", 21);
        textField3.setEditable(false);
        add(textField3);

        passwordField = new JPasswordField("Hidden Text");
        add(passwordField);

        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    private class TextFieldHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String string = "";
            if(e.getSource() == textField1) {
                string = String.format("textField1: %s", e.getActionCommand());
            } else if(e.getSource() == textField2) {
                string = String.format("textField2: %s", e.getActionCommand());
            } else if(e.getSource() == textField3) {
                string = String.format("textField3: %s", e.getActionCommand());
            }  else if(e.getSource() == passwordField) {
                string = String.format("passwordField: %s", e.getActionCommand());
            }

            JOptionPane.showMessageDialog(null, string);
        }
    }
}
