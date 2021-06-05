class Digit {
    public static void main(String[] args) {
	System.out.println(digit(86429, 3));
	System.out.println(digit(86429, 10));	
    }
    static int digit(long n, int k) {
	long pow_10 = 1;
	for (int i = 0; i < k; ++i) {
	    pow_10 *= 10;
	}
	n /= pow_10;
	int result = ((int) n) % 10;
	//	return (result == 0 ? -1 : result);
	if (result == 0) {
	    return -1;
	}
	return result;
    }
}
