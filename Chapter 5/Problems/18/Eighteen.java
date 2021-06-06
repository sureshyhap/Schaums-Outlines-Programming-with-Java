class Pow {
    public static void main(String[] args) {
	System.out.println(pow(2, 5));
	System.out.println(pow(2, -3));	
    }
    public static double pow(double x, int n) {
	if (n == 0) {
	    return 1;
	}
	else if (n > 0) {
	    return x * pow(x, n - 1);
	}
	else {
	    return pow(x, n + 1) / x;
	}
    }
}
