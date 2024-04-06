package window;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Container;

import window.FileExplorer;
import window.Menu;

public class Window {
    int WIDTH = 500;
    int HEIGHT = 500;
    String TITLE = "Red String";
    
    public Window() {
        JFrame win_frame = new JFrame();

        Menu winMenu = new Menu(win_frame); 

        JPanel filesPanel = new JPanel(new FlowLayout());

        FileExplorer exp = new FileExplorer(filesPanel);
        
        filesPanel.add(exp);
        
        win_frame.add(filesPanel);


        win_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        win_frame.setPreferredSize(new DimensionUIResource(WIDTH, HEIGHT));
        win_frame.setTitle(TITLE);
        win_frame.pack();
        win_frame.setLocationRelativeTo(null);
        win_frame.setVisible(true);
    }
}
