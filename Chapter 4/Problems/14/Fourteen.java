import java.io.*;

class Guessing_Game {
    public static void main(String[] args) throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Guess a number from 1 to 6: ");
	do {
	    System.out.print("Guess: ");
	    int guess = Integer.parseInt(in.readLine());
	    if (guess == 3) {
		System.out.println("You got it!");
		return;
	    }
	    else {
		System.out.println("Nope. Guess again.");
	    }
	} while (true);
    }
}
