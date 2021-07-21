import java.io.*;

public class Eight {
    private static final String filename = "inventory.txt";
    private static final String filename2 = "inventory2.txt";
    
    public static void main(String[] args) throws IOException {
	if (args.length != 2) {
	    System.err.println("Two command line arguments required.\n");
	    System.exit(0);
	}
	String food = args[0];
	int change = Integer.parseInt(args[1]);
	BufferedReader in = new BufferedReader(new FileReader(filename));
	PrintWriter out = new PrintWriter(new FileWriter(filename2));
	String line = null;
	while ((line = in.readLine()) != null) {
	    String[] s = line.split(" ");
	    if (s[0].equals(food)) {
		int count = Integer.parseInt(s[1]) + change;
		if (count < 0) {
		    count = 0;
		}
		/*
		int num_digits = 0;
		int copy_count = count;
		while (copy_count != 0) {
		    copy_count /= 10;
		    ++num_digits;
		}
		int num_spaces = LINE_LENGTH - (food.length() + num_digits);
		StringBuffer buf = new StringBuffer(food);
		for (int i = 0; i < num_spaces; ++i) {
		    buf.append(" ");
		}
		buf.append(Integer.toString(count));
		String st = buf.toString();
		*/
		out.write(food + " " + count + "\n");
	    }
	    else {
		out.write(line + "\n");
	    }
	}
	in.close();
	out.close();
    }
}
