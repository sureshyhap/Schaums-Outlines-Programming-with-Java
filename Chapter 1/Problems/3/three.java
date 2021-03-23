import java.io.*;

class Names {
    public static void main(String[] args) throws IOException {
	BufferedReader in;
	in = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter your last name: ");
	String last = in.readLine();
	System.out.print("Enter your first name: ");
	String first = in.readLine();
	System.out.println("Hello, " + first + " " + last);
    }
}
