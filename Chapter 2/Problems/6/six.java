import java.io.*;

class Y2K {
    public static void main(String[] args) throws IOException {
	System.out.print("Enter a data in the form mm/dd/yy: ");
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String before = in.readLine();
	StringBuffer before_buf = new StringBuffer(before);
	String after = before_buf.insert(6, "19").toString();
	System.out.println(after);
    }
}
