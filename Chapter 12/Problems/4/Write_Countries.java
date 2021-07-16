import java.io.*;

public class Write_Countries {
    public Write_Countries() throws IOException {
	BufferedReader in = new BufferedReader(new FileReader("countries.txt"));
	String country_details = in.readLine();
	BufferedReader country_file_in = new BufferedReader(new InputStreamReader(System.in));
	while (country_details != null) {
	    String[] details = country_details.split("\t");
	    Country c = new Country(details[0], details[1], details[2], Integer.parseInt(details[3]), Integer.parseInt(details[4]));
	    System.out.print("Enter filename for country: ");
	    String filename = country_file_in.readLine();
	    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
	    out.writeObject(c);
	    out.close();
	    country_details = in.readLine();
	}
	in.close();
    }
}
