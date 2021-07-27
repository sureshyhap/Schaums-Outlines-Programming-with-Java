import java.awt.*;
import javax.swing.*;
import java.util.Random;
import javax.swing.border.Border;

public class Sixteen {
    public static void main(String[] args) {
	Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();
	int w = screen_size.width;
	int h = screen_size.height;
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(w, h);
	frame.setLocation(0, 0);
	frame.setTitle("Random");
	frame.setBackground(Color.white);
	Border black_line = BorderFactory.createLineBorder(Color.black);
	Random random = new Random();
	for (int i = 0; i < 8; ++i) {
	    JPanel panel = new JPanel();
	    int red = random.nextInt(256);
	    int green = random.nextInt(256);
	    int blue = random.nextInt(256);
	    panel.setSize(100, 100);
	    panel.setBackground(new Color(red, green, blue));
	    int x_max = w - 100;
	    int y_max = h - 100;
	    int x = random.nextInt(x_max);
	    int y = random.nextInt(y_max);
	    panel.setLocation(x, y);
	    panel.setBorder(black_line);
	    frame.getContentPane().add(panel);
	}
	frame.setVisible(true);
    }
}
