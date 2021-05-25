import java.util.Random;

class Inverse_Square_Summation {
    public static void main(String[] args) {
	Random random = new Random();
	int n = random.nextInt(1000);
	double summation = 0;
	double formula = 0;
	for (int i = 1; i <= n; ++i) {
	    summation += (1 / (double)(i * i));
	}
	formula = (Math.PI * Math.PI) / 6;
	System.out.println("n = " + n);
	System.out.println("summation = " + summation);
	System.out.println("(PI^2) / 6 = " + formula);
	System.out.println("Error = " + Math.abs(summation - formula));
    }
}
