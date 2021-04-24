import java.util.Random;

class Divisible {
    public static void main(String[] args) {
	Random r = new Random();
	int n = 2 + r.nextInt(599);
	System.out.println(n + " is:");
	if (n % 2 == 0) {
	    System.out.println("divisible by 2");
	    if (n % 3 == 0) {
		System.out.println("divisible by 3");
		System.out.println("divisible by 6");
		if (n % 5 == 0) {
		    System.out.println("divisible by 5");
		    System.out.println("divisible by 10");
		    System.out.println("divisible by 15");
		    System.out.println("divisible by 30");
		}
	    }
	    else if (n % 5 == 0) {
		System.out.println("divisible by 5");
		System.out.println("divisible by 10");
	    }
	}
	else if (n % 3 == 0) {
	    System.out.println("divisible by 3");
	    if (n % 5 == 0) {
		System.out.println("divisible by 5");
		System.out.println("divisible by 15");
	    }
	}
	else if (n % 5 == 0) {
	    System.out.println("divisible by 5");	    
	}
    }
}
