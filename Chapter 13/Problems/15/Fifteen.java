import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Fifteen {
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
    JLabel directions2;
    JTextField celsius;
    JLabel conversion;
    TemperaturePanel() {
	directions = new JLabel("Fahrenheit: ");
	fahrenheit = new JTextField(3);
	fahrenheit.addActionListener(this);
	directions2 = new JLabel("Celsius: ");
	celsius = new JTextField(3);
	celsius.addActionListener(this);
	conversion = new JLabel();
	conversion.setFont(new Font(null, 0, 28));
	add(directions);
	add(fahrenheit);
	add(directions2);
	add(celsius);
	add(conversion);
    }
    public void actionPerformed(ActionEvent event) {
	double f = 0.0, c = 0.0;
	if (fahrenheit.getText().length() > 0) {
	    f = Double.parseDouble(fahrenheit.getText());
	    c = Math.round((f - 32) / 1.8);
	    fahrenheit.setText("");
	}
	else if (celsius.getText().length() > 0) {
	    c = Double.parseDouble(celsius.getText());
	    f = Math.round(c * 1.8 + 32);
	    celsius.setText("");
	}
	conversion.setText(f + "\u00B0F = " + c + "\u00B0C");
    }
}
