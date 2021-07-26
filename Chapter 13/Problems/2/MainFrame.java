import javax.swing.*;

public class MainFrame extends JFrame {
    MainFrame() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300, 200);
	setVisible(true);
    }    
    public static void main(String[] args) {
	new MainFrame();
    }
}
