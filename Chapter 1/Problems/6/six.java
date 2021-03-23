import java.io.*;

class FarToCel {
    public static void main(String[] args) throws IOException {
	BufferedReader in;
	in = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter a temperature in Farenheit: ");
	String farenheit_str = in.readLine();
	int farenheit = Integer.parseInt(farenheit_str);
	int celsius = 5 * (farenheit - 32) / 9;
	System.out.println("The temperature in Celsius is: " + celsius);
    }
}
