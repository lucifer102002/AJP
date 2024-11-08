import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends Frame implements MouseListener {
    
    Label label;

    public MouseListenerExample() {
        // Set up the frame
        label = new Label();
        label.setBounds(20, 50, 300, 30);
        
        add(label);
        addMouseListener(this);  // Add MouseListener to the Frame
        
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        // Close window on clicking close button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Methods from MouseListener interface
    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered the Frame");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited the Frame");
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}