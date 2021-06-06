class Fib_Rec {
    public static void main(String[] args) {
	System.out.println(fib(20));
    }
    public static long fib(int n) {
	if (n < 2) {
	    return n;
	}
	return fib(n - 1) + fib(n - 2);
    }
}
