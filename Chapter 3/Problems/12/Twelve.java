import java.io.*;

class Month {
    public static void main(String[] args) throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter the month: ");
	String month = in.readLine();
	System.out.println("You entered " + month);
	String beginning = month.substring(0, 3);
	beginning = beginning.toUpperCase();
	System.out.println("It's abbreviation is " + beginning);
	int num_month = 0;
	if (beginning.equals("JAN")) {
	    num_month = 1;
	}
	else if (beginning.equals("FEB")) {
	    num_month = 2;
	}
	else if (beginning.equals("MAR")) {
	    num_month = 3;
	}
	else if (beginning.equals("APR")) {
	    num_month = 4;
	}
	else if (beginning.equals("MAY")) {
	    num_month = 5;
	}
	else if (beginning.equals("JUN")) {
	    num_month = 6;
	}
	else if (beginning.equals("JUL")) {
	    num_month = 7;
	}
	else if (beginning.equals("AUG")) {
	    num_month = 8;
	}
	else if (beginning.equals("SEP")) {
	    num_month = 9;
	}
	else if (beginning.equals("OCT")) {
	    num_month = 10;
	}
	else if (beginning.equals("NOV")) {
	    num_month = 11;
	}
	else if (beginning.equals("DEC")) {
	    num_month = 12;
	}
	System.out.println("This is month number " + num_month);
    }
}
