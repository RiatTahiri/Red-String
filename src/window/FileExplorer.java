package window;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class FileExplorer extends JPanel{
    private JTree tree;   

    public FileExplorer(JPanel panel) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode second = new DefaultMutableTreeNode("Second");
        DefaultMutableTreeNode third = new DefaultMutableTreeNode("third");

        root.add(second);
        root.add(third);

        JTree tree = new JTree(root);

        panel.add(tree);
    }
}
