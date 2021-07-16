import java.io.*;

public class One {
    public static void main(String[] args) throws IOException {
	String filename = "test.txt";
	BufferedReader in = new BufferedReader(new FileReader(filename));
	int lines = 0, words = 0, chars = 0;
	String line = null;
	String[] individual_words = null;
	line = in.readLine();
	while (line != null) {
	    ++lines;
	    chars += line.length();
	    individual_words = line.split("\\s");
	    words += individual_words.length;
	    line = in.readLine();
	}
	System.out.println("Lines: " + lines);
	System.out.println("Words: " + words);
	System.out.println("Chars: " + chars);
    }
}
