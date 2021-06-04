class Combination_Alternate {
    public static void main(String[] args) {
	int n = Integer.parseInt(args[0]);
	int k = Integer.parseInt(args[1]);
	System.out.println(combination(n, k));
    }
    public static int combination(int n, int k) {
	int result = 1;
	for (int i = 1; i <= k; ++i) {
	    result *= (n - i + 1);
	    result /= i;
	}
	return result;
    }
}
