class How_Many_Primes {
    public static void main(String[] args) {
	int x = 0;
	int function_value = 0;
	boolean is_prime = true;
	out:
	while (is_prime) {
	    function_value = (x * x) + x + 41;
	    // The second condition will always be true but leaving
	    // it for completeness
	    if (function_value % 2 == 0 && function_value != 2) {
		break;
	    }
	    for (int i = 3; i <= Math.sqrt(function_value); i += 2) {
		if (function_value % i == 0) {
		    is_prime = false;
		    break out;
		}
	    }
	    System.out.println("\t" + x + "\t" + function_value);
	    ++x;
	}
    }
}
