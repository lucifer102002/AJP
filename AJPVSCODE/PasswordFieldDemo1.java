import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;

public class PasswordFieldDemo1 extends JFrame {
    JPasswordField passwordField;
    JLabel label;

    public PasswordFieldDemo1() {
        setTitle("Password Field Demo");

        // Create a password field and set the echo character to '#'
        passwordField = new JPasswordField(20);
        passwordField.setEchoChar('#');

        // Limit password field to only 6 characters
        ((AbstractDocument) passwordField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (fb.getDocument().getLength() + text.length() - length <= 6) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }

            @Override
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
                if (fb.getDocument().getLength() + text.length() <= 6) {
                    super.insertString(fb, offset, text, attr);
                }
            }
        });

        label = new JLabel("Enter Password (Max 6 chars): ");

        // Button to show the password entered
        JButton showButton = new JButton("Show Password");
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the password and display it
                char[] password = passwordField.getPassword();
                JOptionPane.showMessageDialog(null, "Password entered: " + new String(password));
            }
        });

        // Create a panel and add components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(label);
        panel.add(passwordField);
        panel.add(showButton);

        // Add panel to frame
        add(panel);

        // Frame settings
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PasswordFieldDemo();  // Create the frame and make it visible
    }
}
