import java.awt.event.*;
import javax.swing.*;

public class MouseDemo extends JFrame implements MouseListener {
    JLabel l;

    public MouseDemo() {
        // Set up the frame
        setTitle("Mouse Demo");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and add the label
        l = new JLabel("Hello Mouse");
        l.setBounds(50, 150, 300, 100);
        add(l);

        // Register the mouse listener
        addMouseListener(this);

        // Set the frame visible
        setVisible(true);
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed no. of clicks: " + e.getClickCount() + " at position " + e.getX() + ", " + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released; # of clicks: " + e.getClickCount());
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked (# of clicks: " + e.getClickCount() + ")");
    }

    public static void main(String[] args) {
        // Run the program
        new MouseDemo();
    }
}
