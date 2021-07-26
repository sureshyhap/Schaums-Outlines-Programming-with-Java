import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Thirteen {
    public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(1024, 768);
	frame.setLocation((1920 - 1024) / 2, (1080 - 768) / 2);
	frame.setTitle("Main Frame");
	JPanel main_panel = new JPanel();

	JButton black = new JButton("black");
	main_panel.add(black);
	black.addActionListener(new ColoredAction(Color.black, main_panel));

	JButton blue = new JButton("blue");
	main_panel.add(blue);
	blue.addActionListener(new ColoredAction(Color.blue, main_panel));

	JButton cyan = new JButton("cyan");
	main_panel.add(cyan);
	cyan.addActionListener(new ColoredAction(Color.cyan, main_panel));

	JButton darkGray = new JButton("darkGray");
	main_panel.add(darkGray);
	darkGray.addActionListener(new ColoredAction(Color.darkGray, main_panel));

	JButton gray = new JButton("gray");
	main_panel.add(gray);
	gray.addActionListener(new ColoredAction(Color.gray, main_panel));

	JButton green = new JButton("green");
	main_panel.add(green);
	green.addActionListener(new ColoredAction(Color.green, main_panel));

	JButton lightGray = new JButton("lightGray");
	main_panel.add(lightGray);
	lightGray.addActionListener(new ColoredAction(Color.lightGray, main_panel));

	JButton magenta = new JButton("magenta");
	main_panel.add(magenta);
	magenta.addActionListener(new ColoredAction(Color.magenta, main_panel));

	JButton orange = new JButton("orange");
	main_panel.add(orange);
	orange.addActionListener(new ColoredAction(Color.orange, main_panel));

	JButton pink = new JButton("pink");
	main_panel.add(pink);
	pink.addActionListener(new ColoredAction(Color.pink, main_panel));

	JButton red = new JButton("red");
	main_panel.add(red);
	red.addActionListener(new ColoredAction(Color.red, main_panel));

	JButton white = new JButton("white");
	main_panel.add(white);
	white.addActionListener(new ColoredAction(Color.white, main_panel));

	JButton yellow = new JButton("yellow");
	main_panel.add(yellow);
	yellow.addActionListener(new ColoredAction(Color.yellow, main_panel));

	
	frame.getContentPane().add(main_panel);
	frame.setVisible(true);
    }
}
class ColoredAction extends JPanel implements ActionListener {
    private Color color;
    private JPanel panel;
    ColoredAction(Color color, JPanel panel) {
	this.color = color;
	this.panel = panel;
    }
    public void actionPerformed(ActionEvent event) {
	panel.setBackground(color);
    }
}
