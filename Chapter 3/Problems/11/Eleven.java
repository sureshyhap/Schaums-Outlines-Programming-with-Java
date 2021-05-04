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
	char first = beginning.charAt(0), second = beginning.charAt(1), third = beginning.charAt(2);
	int num_month = 0;
	if (first == 'J') {
	    // January
	    if (second == 'A') {
		num_month = 1;
	    }
	    // June
	    else if (third == 'N') {
		num_month = 6;
	    }
	    // July
	    else {
		num_month = 7;
	    }
	}
	// February
	else if (first == 'F') {
	    num_month = 2;
	}
	else if (first == 'M') {
	    // March
	    if (third == 'R') {
		num_month = 3;
	    }
	    // May
	    else {
		num_month = 5;
	    }
	}
	else if (first == 'A') {
	    // April
	    if (second == 'P') {
		num_month = 4;
	    }
	    // August
	    else {
		num_month = 8;
	    }
	}
	// September
	else if (first == 'S') {
	    num_month = 9;
	}
	// October
	else if (first == 'O') {
	    num_month = 10;
	}
	// November
	else if (first == 'N') {
	    num_month = 11;
	}
	// December
	else {
	    num_month = 12;
	}
	System.out.println("This is month number " + num_month);
    }
}
