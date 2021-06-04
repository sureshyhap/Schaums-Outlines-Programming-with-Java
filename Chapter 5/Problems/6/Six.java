class Permute {
    public static void main(String[] args) {
	int n = Integer.parseInt(args[0]);
	int k = Integer.parseInt(args[1]);
	System.out.println(permutation(n, k));
    }
    public static int permutation(int n, int k) {
	int result = 1;
	int i = n;
	while (i > n - k) {
	    result *= i;
	    --i;
	}
	return result;
    }
}
