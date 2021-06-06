class Triangular {
    public static void main(String[] args) {
	System.out.println(t(6));
    }
    static long t(int n) {
	if (n == 1) {
	    return 1;
	}
	return t(n - 1) + n;
    }
}
