import java.util.Random;

class Prime {
    public static void main(String[] args) {
	Random random = new Random();
	int num = 2 + random.nextInt(98);
	boolean is_prime = true;
	if (num % 2 == 0 && num != 2) {
	    is_prime = false;
	}
	for (int i = 3; is_prime && (i <= Math.sqrt(num)); i += 2) {
	    if (num % i == 0) {
		is_prime = false;
	    }
	}
	if (is_prime) {
	    System.out.println(num + " is prime.");
	}
	else {
	    System.out.println(num + " is not prime.");
	}
    }
}
