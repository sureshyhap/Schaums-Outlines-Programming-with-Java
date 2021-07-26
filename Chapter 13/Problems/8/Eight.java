import java.awt.*;
import javax.swing.*;

public class Eight {
    public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(400, 300);
	frame.setLocation(400, 300);
	frame.setVisible(true);
	JPanel panel = new JPanel();
	JLabel label = new JLabel("Go, Blue!");
	panel.setBackground(Color.yellow);
	label.setForeground(Color.blue);
	panel.add(label);
	frame.getContentPane().add(panel);
    }
}
