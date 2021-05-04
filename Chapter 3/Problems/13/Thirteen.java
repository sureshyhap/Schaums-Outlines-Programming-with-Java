import java.io.*;
import java.util.Calendar;

class College_Classification {
    public static void main(String[] args) throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter year of graduation: ");
	String input = in.readLine();
	int year_graduate = Integer.parseInt(input);
	int current_year = Calendar.getInstance().get(Calendar.YEAR);
	String classification;
	switch (current_year - year_graduate) {
	case 0:
	    classification = "freshman";
	    break;
	case 1:
	    classification = "sophomore";
	    break;
	case 2:
	    classification = "junior";
	    break;
	case 3:
	    classification = "senior";
	    break;
	default:
	    // Graduated 4 or more years ago
	    if (current_year > year_graduate) {
		classification = "graduate";		
	    }
	    // Hasn't graduated yet
	    else {
		classification = "prematriculant";
	    }
	    break;
	}
	System.out.println("You are a " + classification);
    }
}
