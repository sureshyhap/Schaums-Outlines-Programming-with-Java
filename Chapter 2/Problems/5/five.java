import java.io.*;

class PhoneNumber {
    public static void main(String[] args) throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter 10-digit telephone number: ");
	String pn = in.readLine();
	System.out.println("You entered " + pn);
	String area_code = pn.substring(0, 3);
	System.out.println("The area code is " + area_code);
	String first_part = pn.substring(3, 6);
	System.out.println("The exchange is " + first_part);
	String last_part = pn.substring(6);
	System.out.println("The number is " + last_part);
	String rewritten = "(" + area_code + ")" + first_part + "-" + last_part;
	System.out.println("The complete telephone number is " + rewritten);
    }
}
