import java.io.*;

class Capitalize {
    public static void main(String[] args) throws IOException {
	System.out.print("Enter two words: ");
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String input = in.readLine();
	String lower = input.toLowerCase();
	int first_space = lower.indexOf(' ');
	int last_space = lower.lastIndexOf(' ');
	String first_word = lower.substring(0, first_space);
	String last_word = lower.substring(last_space + 1);
	StringBuffer first = new StringBuffer(first_word);
	StringBuffer last = new StringBuffer(last_word);
	char first_character = first.charAt(0);
	char last_character = last.charAt(0);
	String first_letter = String.valueOf(first_character);
	String last_letter = String.valueOf(last_character);
	first.setCharAt(0, first_letter.toUpperCase().charAt(0));
	last.setCharAt(0, last_letter.toUpperCase().charAt(0));
	String result = first.toString() + ' ' + last.toString();
	System.out.println(result);
    }
}
