import java.awt.*;
import javax.swing.*;

public class Six {
    public static void main(String[] args) {
	Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();
	int res = Toolkit.getDefaultToolkit().getScreenResolution();
	System.out.println("Width: " + screen_size.width);
	System.out.println("Height: " + screen_size.height);
	System.out.println("Resolution: " + res);
    }
}
