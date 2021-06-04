class Combintation {
    public static void main(String[] args) {
	int n = Integer.parseInt(args[0]);
	int k = Integer.parseInt(args[1]);
	System.out.println(combination(n, k));
    }
    public static int factorial(int n) {
	int result = 1;
	for (int i = n; i > 1; --i) {
	    result *= i;
	}
	return result;
    }
    public static int combination(int n, int k) {
	return factorial(n) / (factorial(k) * factorial(n - k));
    }
}
