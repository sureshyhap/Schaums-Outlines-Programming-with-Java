class Square {
    public static void main(String[] args) {
	System.out.println(s(6));
    }
    public static long s(int n) {
	if (n == 1) {
	    return 1;
	}
	return s(n - 1) + (2 * n - 1);
    }
}
