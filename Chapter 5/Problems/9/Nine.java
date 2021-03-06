class Compare_Com {
    public static void main(String[] args) {
	int n = Integer.parseInt(args[0]);
	// Breaks for n = 13
	System.out.println(combination1(n, n / 2));
	System.out.println(combination2(n, n / 2));
    }
    public static int factorial(int n) {
	int result = 1;
	for (int i = n; i > 1; --i) {
	    result *= i;
	}
	return result;
    }
    public static int combination1(int n, int k) {
	return factorial(n) / (factorial(k) * factorial(n - k));
    }    
    public static int combination2(int n, int k) {
	int result = 1;
	for (int i = 1; i <= k; ++i) {
	    result *= (n - i + 1);
	    result /= i;
	}
	return result;
    }    
}
