class Factorial_Overflow {
    public static void main(String[] args) {
	for (int i = 0; i < 26; ++i) {
	    System.out.print(i + "!: ");
	    System.out.println(factorial(i));
	}
    }
    public static int factorial(int n) {
	int result = 1;
	for (int i = n; i > 1; --i) {
	    result *= i;
	}
	return result;
    }
}
