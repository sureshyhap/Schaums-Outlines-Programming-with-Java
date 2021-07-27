import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Eighteen {
    public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300, 200);
	frame.setLocation(400, 0);
	frame.setTitle("Main Frame");
	JPanel panel = new CalculatorPanel();
	frame.getContentPane().add(panel);
	frame.setVisible(true);
    }
}
class CalculatorPanel extends JPanel {
    JLabel directions;
    JTextField first;
    JLabel directions2;
    JTextField second;
    JLabel result;
    JButton add;
    JButton subtract;
    JButton multiply;
    JButton divide;
    CalculatorPanel() {
	directions = new JLabel("First: ");
	first = new JTextField(3);
	//	first.addActionListener(this);
	directions2 = new JLabel("Second: ");
	second = new JTextField(3);
	//	second.addActionListener(this);
	result = new JLabel();
	add = new JButton("+");
	add.addActionListener(new ButtonListener("add"));
	subtract = new JButton("-");
	subtract.addActionListener(new ButtonListener("subtract"));
	multiply = new JButton("*");
	multiply.addActionListener(new ButtonListener("multiply"));
	divide = new JButton("/");
	divide.addActionListener(new ButtonListener("divide"));
	result.setFont(new Font(null, 0, 28));
	add(directions);
	add(first);
	add(directions2);
	add(second);
	add(result);
	JPanel panel = new JPanel();
	panel.add(add);
	panel.add(subtract);
	panel.add(multiply);
	panel.add(divide);
	add(panel);
    }
    class ButtonListener implements ActionListener {
	private String operation;
	ButtonListener(String operation) {
	    this.operation = operation;
	}
	public void actionPerformed(ActionEvent event) {
	    if (first.getText().length() > 0 &&
		second.getText().length() > 0) {
		double first_num = Double.parseDouble(first.getText());
		double second_num = Double.parseDouble(second.getText());
		double result_num = 0;
		if (operation.equals("add")) {
		    result_num = first_num + second_num;
		}
		else if (operation.equals("subtract")) {
		    result_num = first_num - second_num;
		}
		else if (operation.equals("multiply")) {
		    result_num = first_num * second_num;
		}
		else if (operation.equals("divide")) {
		    result_num = first_num / second_num;
		}
		result.setText(String.valueOf(result_num));
	    }
	}
    }
}
