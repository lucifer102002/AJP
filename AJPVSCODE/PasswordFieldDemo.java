import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PasswordFieldDemo extends JFrame {
    JPasswordField passwordField;
    JLabel label;

    public PasswordFieldDemo() {
        setTitle("Password Field Demo");

        
        passwordField = new JPasswordField(20);
        passwordField.setEchoChar('#');

        label = new JLabel("Enter Password: ");


        JButton showButton = new JButton("Show Password");
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                char[] password = passwordField.getPassword();
                JOptionPane.showMessageDialog(null, "Password entered: " + new String(password));
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(label);
        panel.add(passwordField);
        panel.add(showButton);

        
        add(panel);

        
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PasswordFieldDemo();
    }
}
 