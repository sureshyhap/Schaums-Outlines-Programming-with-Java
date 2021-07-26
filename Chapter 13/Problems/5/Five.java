import javax.swing.*;
import java.awt.*;

public class Five {
    public static void main(String[] args) {
	Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();
	int w = screen_size.width;
	int h = screen_size.height;
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(w / 4, h / 4);
	frame.setTitle("Main Frame");
	frame.setLocation(3 * w / 8, 3 * h / 8);
	frame.setVisible(true);
    }
}
