import java.util.Random;
import java.io.*;

class Guess {
    public static void main(String[] args) throws IOException {
	Random random = new Random();
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int rand_num = 1 + random.nextInt(100);
	System.out.println("I'm thinking of a number from 1 to 100");
	System.out.print("Guess what it is: ");
	int guess = Integer.parseInt(in.readLine());
	for (int i = 0; i < 5; ++i) {
	    if (guess == rand_num) {
		System.out.println("You guessed it!");
		break;
	    }
	    else if (i == 4) {
		System.out.println("No: the number was " + rand_num);
		break;
	    }
	    else {
		System.out.println("No: that's too " + (guess < rand_num ? "low." : "high."));
		System.out.print("Guess again: ");
		guess = Integer.parseInt(in.readLine());
	    }
	}
    }
}
