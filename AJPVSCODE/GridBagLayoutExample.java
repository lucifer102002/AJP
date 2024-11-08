import java.awt.*;
import javax.swing.*;

public class GridBagLayoutExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Set the layout manager to GridBagLayout
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Common constraints for all buttons
        gbc.fill = GridBagConstraints.BOTH;  // Make the buttons expand both horizontally and vertically
        gbc.insets = new Insets(5, 5, 5, 5);  // Add padding around buttons
        gbc.weightx = 1.0;  // Expand horizontally
        gbc.weighty = 1.0;  // Expand vertically
        gbc.ipadx = 20;  // Internal padding on the x-axis
        gbc.ipady = 20;  // Internal padding on the y-axis

        // Button 1
        JButton button1 = new JButton("1");
        gbc.gridx = 0;  // Column 0
        gbc.gridy = 0;  // Row 0
        frame.add(button1, gbc);

        // Button 2
        JButton button2 = new JButton("2");
        gbc.gridx = 1;  // Column 1
        gbc.gridy = 0;  // Row 0
        frame.add(button2, gbc);

        // Button 3
        JButton button3 = new JButton("3");
        gbc.gridx = 0;  // Column 0
        gbc.gridy = 1;  // Row 1
        frame.add(button3, gbc);

        // Button 4
        JButton button4 = new JButton("4");
        gbc.gridx = 1;  // Column 1
        gbc.gridy = 1;  // Row 1
        frame.add(button4, gbc);

        // Button 5
        JButton button5 = new JButton("5");
        gbc.gridx = 0;  // Column 0
        gbc.gridy = 2;  // Row 2
        gbc.gridwidth = 2;  // Span across 2 columns
        frame.add(button5, gbc);

        // Make the frame visible
        frame.setVisible(true);
    }
}
