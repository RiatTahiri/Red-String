package window;

import javax.swing.JFrame;
import javax.swing.plaf.DimensionUIResource;

public class Window {
    int WIDTH = 500;
    int HEIGHT = 500;
    String TITLE = "Red String";
    
    public Window() {
        JFrame win_frame = new JFrame();

        win_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        win_frame.setPreferredSize(new DimensionUIResource(WIDTH, HEIGHT));
        win_frame.setTitle(TITLE);
        win_frame.pack();
        win_frame.setLocationRelativeTo(null);
        win_frame.setVisible(true);
    }
}
