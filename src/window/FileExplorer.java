package window;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

public class FileExplorer extends JPanel{
    private JTree tree;   

    public FileExplorer(JPanel panel) throws IOException {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        
        DefaultMutableTreeNode file = new DefaultMutableTreeNode("HELLO");
    
        JTree tree = new JTree(root);



        root.add(file);
        panel.add(tree);
    }



    public static List getDirectory() throws IOException {

        Path dirPath = Paths.get("C:\\Users\\badvi\\Desktop\\IMAGES");

        // System.out.println(dirPath);

        try (Stream<Path> stream = Files.walk(dirPath, Integer.MAX_VALUE)) {
            List<String> collect = stream.map(String::valueOf).sorted().collect(Collectors.toList());

            return collect;

        } catch(Exception e) {
            System.out.println("There was an error getting the directory" + e);   
        }


        List<String> list = List.of("one", "two", "three");
        return list;
    }
}
