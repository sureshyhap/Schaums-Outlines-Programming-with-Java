import java.util.Random;

class Sine {
    public static void main(String[] args) {
	Random random = new Random();
	int n = random.nextInt(10);
	double x = 0, y = 0;
	System.out.println(x + "\t\t\t" + y);
	for (int i = 1; i <= n; ++i) {
	    x = (i * Math.PI) / n;
	    y = Math.sin(x);
	    System.out.println(x + "\t" + y);
	}
    }
}
