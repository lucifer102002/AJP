import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JTableExample extends JFrame {

    public JTableExample() {
        
        super("JTable Example");

        
        setLayout(new BorderLayout());

        
        String[] columnNames = {"ID", "Name", "State", "Phone Number"};

        
        Object[][] data = {
            {1, "John Doe", "California", "123-456-7890"},
            {2, "Jane Smith", "Texas", "234-567-8901"},
            {3, "Alex Johnson", "New York", "345-678-9012"},
            {4, "Emily Davis", "Florida", "456-789-0123"},
            {5, "Michael Brown", "Ohio", "567-890-1234"},
            {6, "Sophia Wilson", "Georgia", "678-901-2345"},
            {7, "David Anderson", "Virginia", "789-012-3456"},
            {8, "Olivia Thomas", "Illinois", "890-123-4567"},
            {9, "Liam Martinez", "Nevada", "901-234-5678"},
            {10, "Emma Garcia", "Arizona", "012-345-6789"}
        };

        // Create a table model with the data and column names
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Create a JTable using the model
        JTable table = new JTable(model);

        // Add the JTable to a JScrollPane (for scrolling if needed)
        JScrollPane scrollPane = new JScrollPane(table);

        // Add the scrollPane to the center of the frame
        add(scrollPane, BorderLayout.CENTER);

        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  
        setVisible(true);
    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> new JTableExample());
    }
}
