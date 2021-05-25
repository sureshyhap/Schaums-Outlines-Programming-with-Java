class Fibonacci {
    public static void main(String[] args) {
	System.out.print("0, 1");
	for (int fib0 = 0, fib1 = 1, fib2 = 1; fib2 < 1000; fib2 = fib1 + fib0) {
	    System.out.print(", " + fib2);
	    fib0 = fib1;
	    fib1 = fib2;
	}
	System.out.println();
    }
}
