class Pow_Rec {
    public static void main(String[] args) {
	System.out.println(pow(2, 13));
	System.out.println(Math.pow(2, 13));
    }
    public static double pow(double x, int n) {
	if (n == 1) {
	    return x;
	}
	else if ((n > 1) && (n % 2 != 0)) {
	    return x * pow(x, n - 1);
	}
	else if ((n > 1) && (n % 2 == 0)) {
	    return pow(x, n / 2) * pow(x, n / 2);
	}
	// Returns x if n < 0
	return x;
    }
}
