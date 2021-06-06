class Cat {
    public static void main(String[] args) {
	System.out.println(c(7));
    }
    public static long c(int n) {
	if (n == 0) {
	    return 1;
	}
	int sum = 0;
	for (int i = 1; i <= n; ++i) {
	    sum += c(i - 1) * c(n - i);
	}
	return sum;
    }
}
