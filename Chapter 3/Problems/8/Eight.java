import java.util.Random;

class Rand_Year {
    public static void main(String[] args) {
	Random r = new Random();
	int year = 1800 + r.nextInt(201);
	System.out.print(year + " is ");
	if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
	    System.out.println("a leap year");
	}
	else {
	    System.out.println("not a leap year");
	}
    }
}
