import java.io.*;

class CelToFar {
    public static void main(String[] args) throws IOException {
	BufferedReader in;
	in = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter a temperature in Celsius: ");
	String celsius_str = in.readLine();
	int celsius = Integer.parseInt(celsius_str);
	int farenheit = 9 * celsius / 5 + 32;
	System.out.println("The temperature in Farenheit is " + farenheit);
    }
}
