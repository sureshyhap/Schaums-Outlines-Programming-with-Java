import java.util.Random;

class Even_Or_Odd {
    public static void main(String[] args) {
	Random random = new Random();
	int x = random.nextInt(100);
	boolean even = (x % 2 == 0 ? true : false);
	System.out.println(x + " is " + (even ? "even" : "odd"));
    }
}
