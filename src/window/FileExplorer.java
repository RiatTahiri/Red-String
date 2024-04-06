package window;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.Container;

public class FileExplorer extends JPanel {
    private JTree tree;   

    public FileExplorer(Container container) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode second = new DefaultMutableTreeNode("Second");
        DefaultMutableTreeNode third = new DefaultMutableTreeNode("third");

        root.add(second);
        root.add(third);

        tree = new JTree(root);

        container.add(tree);
    }
}
