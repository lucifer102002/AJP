import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample extends Frame implements KeyListener {
    
    Label label;
    TextArea textArea;

    public KeyListenerExample() {
        // Set up the frame
        label = new Label();
        label.setBounds(20, 50, 400, 30);
        textArea = new TextArea();
        textArea.setBounds(20, 100, 400, 300);

        // Add KeyListener to the TextArea
        textArea.addKeyListener(this);

        // Add components to the frame
        add(label);
        add(textArea);
        
        setSize(450, 450);
        setLayout(null);
        setVisible(true);
        
        // Close window on clicking close button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Methods from KeyListener interface
    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + e.getKeyChar());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
