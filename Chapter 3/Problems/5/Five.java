import java.util.Random;

class Three_Rand_Floats {
    public static void main(String[] args) {
	Random r = new Random();
	float a = r.nextFloat();
	float b = r.nextFloat();
	float c = r.nextFloat();
	if (a < b) {
	    if (b < c) {
		System.out.println(a + ", " + b + ", " + c);
	    }
	    else {
		if (a < c) {
		    System.out.println(a + ", " + c + ", " + b);
		}
		else {
		    System.out.println(c + ", " + a + ", " + b);
		}
	    }
	}
	else {
	    if (a < c) {
		System.out.println(b + ", " + a + ", " + c);
	    }
	    else {
		if (b < c) {
		    System.out.println(b + ", " + c + ", " + a);
		}
		else {
		    System.out.println(c + ", " + b + ", " + a);
		}      
	    }
	}
    }
}
