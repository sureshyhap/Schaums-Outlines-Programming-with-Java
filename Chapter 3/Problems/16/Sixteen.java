import java.util.Random;

class Min_and_Max {
    public static void main(String[] args) {
	Random random = new Random();
	int x1 = random.nextInt(1000);
	int x2 = random.nextInt(1000);
	int x3 = random.nextInt(1000);
	int x4 = random.nextInt(1000);
	int min = x1, max = x1;
	if (max < x2) {
	    max = x2;
	}
	if (min > x2) {
	    min = x2;
	}
	if (max < x3) {
	    max = x3;
	}
	if (min > x3) {
	    min = x3;
	}
	if (max < x4) {
	    max = x4;
	}
	if (min > x4) {
	    min = x4;
	}
	System.out.println(x1 + ", " + x2 + ", " + x3 + ", " + x4);
	System.out.println("The minimum is " + min);
	System.out.println("The maximum is " + max);
    }
}
