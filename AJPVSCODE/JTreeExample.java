import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;

public class JTreeExample {
    public static void main(String[] args) {
        // Create the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create child nodes
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        // Add children to the root
        root.add(child1);
        root.add(child2);

        // Create sub-child nodes
        DefaultMutableTreeNode subChild1 = new DefaultMutableTreeNode("Sub-Child 1");
        DefaultMutableTreeNode subChild2 = new DefaultMutableTreeNode("Sub-Child 2");

        // Add sub-children to Child 1
        child1.add(subChild1);
        child1.add(subChild2);

        // Create the tree model and tree
        DefaultTreeModel treeModel = new DefaultTreeModel(root);
        JTree tree = new JTree(treeModel);

        // Set selection mode to single tree selection
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

        // Create a panel to hold the tree
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JScrollPane(tree), BorderLayout.CENTER);

        // Create the frame
        JFrame frame = new JFrame("JTree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}