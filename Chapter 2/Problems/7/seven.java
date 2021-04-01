import java.io.*;

class RearrangeName {
    public static void main(String[] args) throws IOException {
	System.out.print("Enter your name (First Middle Last): ");
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String original_name = in.readLine();
	int space_index = original_name.indexOf(' ');
	String first_name = original_name.substring(0, space_index);
	int space_index2 = original_name.indexOf(' ', space_index + 1);
	String middle_name = original_name.substring(space_index + 1, space_index2);
	String last_name = original_name.substring(space_index2 + 1);
	String result = last_name + ", " + first_name + ' ' + middle_name.charAt(0) + '.';
	System.out.println(result);
    }
}
