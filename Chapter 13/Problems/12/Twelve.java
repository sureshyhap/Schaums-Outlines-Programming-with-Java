import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Twelve {
    public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame.setSize(1024 / 4, 768 / 4);
	frame.setLocation((1920 - 1024 / 4) / 2, (1080 - 768 / 4) / 2);
	JPanel panel = new JPanel();
	panel.setLayout(new GridLayout(6, 16));
	Border black_line = BorderFactory.createLineBorder(Color.black);
	for (int i = 33; i <= 126; ++i) {
	    JPanel p = new JPanel();
	    p.add(new JLabel("" + (char)(i)));
	    p.setBorder(black_line);
	    panel.add(p);
	}
	frame.getContentPane().add(panel);
	frame.setVisible(true);
    }
}
