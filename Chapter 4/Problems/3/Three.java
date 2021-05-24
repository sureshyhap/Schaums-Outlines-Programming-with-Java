import java.util.Random;

class Summation {
    public static void main(String[] args) {
	Random random = new Random();
	int n = random.nextInt(100);
	int summation = 0;
	for (int i = 1; i <= n; ++i) {
	    summation += i;
	}
	int formula = (n * (n + 1)) / 2;
	System.out.println("n = " + n);
	System.out.println("sum = " + summation);
	System.out.println("n*(n+1)/2 = " + formula);
    }
}
