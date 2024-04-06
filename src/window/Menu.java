package window;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Menu extends JFrame {
    private static JMenuBar menubar;
    private static JMenu menu, about;

    private JMenuItem setIP, detectIP;

    public Menu(JFrame frame) {
        menubar = new JMenuBar();
        menu = new JMenu("Server");
        about = new JMenu("About");

        setIP = new JMenuItem("Set IP Address");
        detectIP = new JMenuItem("Detect Automatically");

        menu.add(setIP);
        menu.add(detectIP);
        menubar.add(menu);
        menubar.add(about);

        frame.setJMenuBar(menubar);
    }
   

}
