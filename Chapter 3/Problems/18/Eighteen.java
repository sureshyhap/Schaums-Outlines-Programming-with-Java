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
    }
}
