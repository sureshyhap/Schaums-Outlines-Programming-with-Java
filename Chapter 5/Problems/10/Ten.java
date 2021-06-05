class Power {
    public static void main(String[] args) {
	System.out.println(pow(2.0, -3));
	System.out.println(Math.pow(2.0, -3));
	System.out.println(pow(2.0, 3));
	System.out.println(Math.pow(2.0, 3));
    }
    static double pow(double x, int n) {
	double result = 1;
	if (n > 0) {
	    for (int i = 0; i < n; ++i) {
		result *= x;
	    }
	}
	else if (n < 0) {
	    for (int i = 0; i < Math.abs(n); ++i) {
		result /= x;
	    }
	}
	else {
	    return 1;
	}
	return result;
    }
}
