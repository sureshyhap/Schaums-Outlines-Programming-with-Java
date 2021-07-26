import javax.swing.*;
import java.awt.*;

public class Four {
    public static void main(String[] args) {
	Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();
	int w = screen_size.width;
	int h = screen_size.height;
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(w, h);
	frame.setTitle("Main Frame");
	frame.setLocation(0, 0);
	frame.setVisible(true);
    }
}
