import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Fourteen {
    public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300, 100);
	frame.setLocation(400, 0);
	frame.setTitle("Main Frame");
	JPanel panel = new TemperaturePanel();
	frame.getContentPane().add(panel);
	frame.setVisible(true);
    }
}
class TemperaturePanel extends JPanel implements ActionListener {
    JLabel directions;
    JTextField fahrenheit;
    JLabel conversion;
    TemperaturePanel() {
	directions = new JLabel("Enter fahrenheit temperature: ");
	fahrenheit = new JTextField(3);
	fahrenheit.addActionListener(this);
	conversion = new JLabel();
	conversion.setFont(new Font(null, 0, 28));
	add(directions);
	add(fahrenheit);
	add(conversion);
    }
    public void actionPerformed(ActionEvent event) {
	double f = Double.parseDouble(fahrenheit.getText());
	double c = Math.round((f - 32) / 1.8);
	fahrenheit.setText("");
	conversion.setText(f + "\u00B0F = " + c + "\u00B0C");
    }
}
