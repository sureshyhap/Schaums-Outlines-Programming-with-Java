import java.io.*;

class Chirps {
    public static void main(String[] args) throws IOException {
	BufferedReader in;
	in = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter chirps per minute: ");
	int chirps = Integer.parseInt(in.readLine());
	int temp = 40 + chirps / 4;
	System.out.println("The temperature is " + temp);
    }
}
