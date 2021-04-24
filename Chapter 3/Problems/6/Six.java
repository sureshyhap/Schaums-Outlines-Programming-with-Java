import java.util.Random;

class Divisible {
    public static void main(String[] args) {
	Random r = new Random();
	int n = r.nextInt();
	System.out.print(n + ": ");
	if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
	    System.out.println("Divisible");
	}
    }
}
