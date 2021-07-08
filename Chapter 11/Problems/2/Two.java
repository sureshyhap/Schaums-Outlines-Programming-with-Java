import java.io.*;

public class Two {
    public static void main(String[] args) throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	while (true) {
	    System.out.print("Enter an integer: ");
	    String input = in.readLine();
	    try {
		int n = Integer.parseInt(input);
	    } catch (NumberFormatException e) {
		System.out.println("That is not a numeric integer.");
		continue;
	    }
	    System.out.println("You entered 123.");
	    break;
	}
    }
}
