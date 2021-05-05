import java.util.Random;

class Decile {
    public static void main(String[] args) {
	Random random = new Random();
	double d = random.nextDouble();
	String decile;
	if (d < .1) {
	    decile = "first";
	}
	else if (d < .2) {
	    decile = "second";
	}
	else if (d < .3) {
	    decile = "third";
	}
	else if (d < .4) {
	    decile = "fourth";
	}
	else if (d < .5) {
	    decile = "fifth";
	}
	else if (d < .6) {
	    decile = "sixth";
	}
	else if (d < .7) {
	    decile = "seventh";
	}
	else if (d < .8) {
	    decile = "eighth";
	}
	else if (d < .9) {
	    decile = "ninth";
	}
	else {
	    decile = "tenth";
	}
	System.out.println(d + " is in the " + decile + " decile");
    }
}
