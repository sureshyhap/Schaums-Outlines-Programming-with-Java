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
	String months = "JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC";
	int spot = months.indexOf(beginning);
	num_month = (spot / 3) + 1;
	System.out.println("This is month number " + num_month);
	int num_days = 0;
	switch (num_month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
	    num_days = 31;
	    break;
	case 4:
	case 6:
	case 9:
	case 11:
	    num_days = 30;
	    break;
	case 2:
	    num_days = 28;
	    break;
	}
	System.out.println("It has " + num_days + " days.");
    }
}
