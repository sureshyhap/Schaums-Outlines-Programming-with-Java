import java.util.Random;

class Max {
    public static void main(String[] args) {
	Random random = new Random();
	int x1 = random.nextInt(100);
	int x2 = random.nextInt(100);
	System.out.println(x1 + ", " + x2);
	System.out.println((x1 > x2 ? x1 : x2) + " is the maximum");
    }
}
