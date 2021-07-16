import java.io.*;
import java.util.Arrays;

public class Two {
    public static void main(String[] args) throws IOException {
	String filename = "test.txt";
	BufferedReader in = new BufferedReader(new FileReader(filename));
	String line = in.readLine();
	int line_length = 100;
	while (line != null) {
	    System.out.println(right_justify(line, line_length));
	    line = in.readLine();
	}
    }
    private static String right_justify(String s, int n) {
	int num_spaces = n - s.length();
	char[] c = new char[num_spaces];
	Arrays.fill(c, ' ');
	String spaces = new String(c);
	return spaces + s;
    }
}
