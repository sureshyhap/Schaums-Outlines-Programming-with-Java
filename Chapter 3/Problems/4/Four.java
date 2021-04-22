import java.util.Random;

class Rand_Double {
    public static void main(String[] args) {
	Random r = new Random();
	double x = r.nextDouble();
	System.out.println("x = " + x);
	if (x >= 0 && x < .2) {
	    System.out.println("First quintile");
	}
	else if (x >= .2 && x < .4) {
	    System.out.println("Second quintile");	    
	}
	else if (x >= .4 && x < .6) {
	    System.out.println("Third quintile");
	}
	else if (x >= .6 && x < .8) {
	    System.out.println("Fourth quintile");
	}
	else if (x >=.8 && x < 1) {
	    System.out.println("Fifth quintile");	    
	}
    }
}
