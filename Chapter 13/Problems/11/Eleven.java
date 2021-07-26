import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Eleven {
    public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame.setSize(1024, 768);
	frame.setLocation(500, 200);
	frame.setTitle("Main Frame");
	JPanel main_panel = new JPanel();
	//	String r = "00", g = "ff", b = "ff";
	//	String value = r + g + b;
	/*	main_panel.add(new ColoredPanel(Integer.parseInt(r, 16),
					Integer.parseInt(g, 16),
					Integer.parseInt(b, 16)));
	*/
	int value = 0x00FFFF;
	main_panel.add(new ColoredPanel(value));
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
	this(new Color(r, g, b), "(" + Integer.toHexString(r) +
				  ", " + Integer.toHexString(g) +
				  ", " + Integer.toHexString(b) +
				  ")");
    }
    ColoredPanel(int value) {
	this(value / 0x10000, (value / 0x100) % 0x100, value % 0x100);
    }
}

    
