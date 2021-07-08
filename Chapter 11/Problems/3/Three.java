import java.io.*;

public class Three {
    public static void main(String[] args) throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	while (true) {
	    System.out.print("Enter a positive integer: ");
	    String input = in.readLine();	    
	    try {
		int n = Integer.parseInt(input);
		int[] a = new int[n];
		System.out.print("Enter a range for the array: ");
		input = in.readLine();
		int m = Integer.parseInt(input);
		for (int i = 0; i < m; ++i) {
		    System.out.print(a[i] + " ");
		}
		System.out.println();
	    } catch (NumberFormatException e) {
		System.err.println("Not an integer");
		continue;
	    } catch (NegativeArraySizeException e) {
		System.err.println("Not positive");
		continue;
	    } catch (ArrayIndexOutOfBoundsException e) {
		System.err.println("Passed end of array");
		continue;
	    }
	    break;
	}	
    }
}
