import java.util.Random;

class Cubed_Summation {
    public static void main(String[] args) {
	Random random = new Random();
	int n = random.nextInt(100);
	int summation = 0, formula = 0;
	for (int i = 1; i <= n; ++i) {
	    summation += (i * i * i);
	}
	formula = ((n * n) * ((n + 1) * (n + 1))) / 4;
	System.out.println("n = " + n);
	System.out.println("cubed summation = " + summation);
	System.out.println("(n^2)((n+1)^2) / 4 = " + formula);
    }
}
