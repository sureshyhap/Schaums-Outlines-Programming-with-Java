import java.awt.*;
import javax.swing.*;

public class Seven {
    public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("Main Frame");
	Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();
	int w = screen_size.width;
	int h = screen_size.height;
	frame.setSize(w / 5, 100);
	frame.setLocation(2 * w / 5, 0);
	frame.setVisible(true);
	JLabel label = new JLabel("Hello World!");
	label.setFont(new Font(null, Font.BOLD, 40));
	frame.getContentPane().add(label);
    }
}
