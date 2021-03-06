import java.util.Random;

class Squared_Summation {
    public static void main(String[] args) {
	Random random = new Random();
	int n = random.nextInt(100);
	int summation = 0, formula = 0;
	for (int i = 1; i <= n; ++i) {
	    summation += (i * i);
	}
	formula = (n * (n + 1) * (2 * n + 1)) / 6;
	System.out.println("n = " + n);
	System.out.println("squared summation = " + summation);
	System.out.println("n(n+1)(2n+1) / 6 = " + formula);
    }
}
