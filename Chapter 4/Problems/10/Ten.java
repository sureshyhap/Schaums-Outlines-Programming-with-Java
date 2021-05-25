import java.util.Random;

class Approx_E {
    public static void main(String[] args) {
	Random random = new Random();
	int n = random.nextInt(21);
	double summation = 0;
	for (int i = 0; i <= n; ++i) {
	    int fact = 1;
	    for (int j = 2; j <= i; ++j) {
		fact *= j;
	    }
	    summation += 1 / ((double) fact);
	}
	System.out.println("Summation: " + summation);
	System.out.println("e: " + Math.E);
	System.out.println("Error:" + Math.abs(summation - Math.E));
    }
}
