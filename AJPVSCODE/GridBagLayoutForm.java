import java.awt.*;
import javax.swing.*;

public class GridBagLayoutForm {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("GridBagLayout Form Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Set the layout manager to GridBagLayout
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Create and add the "Name" label
        JLabel nameLabel = new JLabel("Name:");
        gbc.gridx = 0;  // Column 0
        gbc.gridy = 0;  // Row 0
        gbc.anchor = GridBagConstraints.LINE_END;  // Right-align the label
        gbc.insets = new Insets(10, 10, 10, 10);  // Add padding around the label
        frame.add(nameLabel, gbc);

        // Create and add the text field for the name
        JTextField nameField = new JTextField(20);
        gbc.gridx = 1;  // Column 1
        gbc.gridy = 0;  // Row 0
        gbc.anchor = GridBagConstraints.LINE_START;  // Left-align the text field
        gbc.fill = GridBagConstraints.HORIZONTAL;  // Make the text field expand horizontally
        frame.add(nameField, gbc);

        // Create and add the "Comments" label
        JLabel commentsLabel = new JLabel("Comments:");
        gbc.gridx = 0;  // Column 0
        gbc.gridy = 1;  // Row 1
        gbc.anchor = GridBagConstraints.LINE_END;  // Right-align the label
        frame.add(commentsLabel, gbc);

        // Create and add the text area for comments
        JTextArea commentsArea = new JTextArea(5, 20);
        gbc.gridx = 1;  // Column 1
        gbc.gridy = 1;  // Row 1
        gbc.anchor = GridBagConstraints.LINE_START;  // Left-align the text area
        gbc.fill = GridBagConstraints.BOTH;  // Make the text area expand horizontally and vertically
        gbc.weightx = 1.0;  // Expand horizontally
        gbc.weighty = 1.0;  // Expand vertically
        frame.add(new JScrollPane(commentsArea), gbc);  // Add JScrollPane to make comments area scrollable

        // Create and add the "Submit" button
        JButton submitButton = new JButton("Submit");
        gbc.gridx = 1;  // Column 1
        gbc.gridy = 2;  // Row 2
        gbc.anchor = GridBagConstraints.LINE_START;  // Left-align the button
        gbc.fill = GridBagConstraints.NONE;  // Do not expand the button
        gbc.weightx = 0;  // Reset horizontal weight to 0 for the button
        gbc.weighty = 0;  // Reset vertical weight to 0 for the button
        frame.add(submitButton, gbc);

        // Make the frame visible
        frame.setVisible(true);
    }
}
