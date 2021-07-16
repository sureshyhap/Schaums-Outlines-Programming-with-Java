import java.io.*;

public class Encryptor {
    private int key;
    public Encryptor(int key) {
	this.key = key;
	if (this.key >= 0) {
	    this.key %= 128;
	}
	while (this.key < 0) {
	    this.key += 128;
	}
    }
    public void encrypt(String in_file, String out_file) throws IOException {
	BufferedReader in = new BufferedReader(new FileReader(in_file));
	PrintWriter out = new PrintWriter(new FileWriter(out_file));
	String line = in.readLine();
	while (line != null) {
	    StringBuffer new_line = new StringBuffer(line);
	    int length_line = line.length();
	    for (int i = 0; i < length_line; ++i) {
		char new_char = (char) ((new_line.charAt(i) + key) % 128);
		new_line.setCharAt(i, new_char);
	    }
	    String s = new_line.toString();
	    out.println(s);	
	    line = in.readLine();
	}
	in.close();
	out.close();
    }
}
