import java.util.Random;

class Min_Rand_Int {
    public static void main(String[] args) {
	Random r = new Random();
	int x1 = r.nextInt();
	int x2 = r.nextInt();
	int min = (x1 < x2 ? x1 : x2);
	System.out.println("x1 = " + x1);
	System.out.println("x2 = " + x2);
	System.out.println("The minimum is " + min);
    }
}
