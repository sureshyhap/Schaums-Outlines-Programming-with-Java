import java.io.*;
import java.util.*;

public class Read_Countries {
    public Read_Countries() throws IOException, ClassNotFoundException {
	BufferedReader country_file_in = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<String> files = new ArrayList<String>();
	System.out.print("Enter filename to deserialize: ");
	String filename = country_file_in.readLine();
	while (filename != null) {
	    files.add(filename);
	    System.out.print("Enter filename to deserialize: ");
	    filename = country_file_in.readLine();
	}
	System.out.println("\n");
	int length = files.size();
	for (int i = 0; i < length; ++i) {
	    ObjectInputStream in = new ObjectInputStream(new FileInputStream(files.get(i)));
	    Object object = in.readObject();
	    System.out.println(object);
	    in.close();
	}
    }
}
