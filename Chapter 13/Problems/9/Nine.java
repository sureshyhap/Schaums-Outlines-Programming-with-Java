import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Nine {
    public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame.setSize(1024, 768);
	frame.setLocation(500, 200);
	frame.setTitle("Main Frame");
	JPanel main_panel = new JPanel();
	String r = "0", g = "ff", b = "ff";
	main_panel.add(new ColoredPanel(Integer.parseInt(r, 16),
					Integer.parseInt(g, 16),
					Integer.parseInt(b, 16)));
	frame.getContentPane().add(main_panel);
	frame.setVisible(true);
    }
}

class ColoredPanel extends JPanel {
    Border black_line = BorderFactory.createLineBorder(Color.black);
    ColoredPanel(Color color, String name) {
	setBackground(color);
	setBorder(black_line);
	JLabel label = new JLabel(name);
	add(label);
    }
    ColoredPanel(int r, int g, int b) {
	setBackground(new Color(r, g, b));
	setBorder(black_line);
	JLabel label = new JLabel("(" + Integer.toHexString(r) +
				  ", " + Integer.toHexString(g) +
				  ", " + Integer.toHexString(b) +
				  ")");
	add(label);
    }
}

    
