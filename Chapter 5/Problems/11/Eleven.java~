class GCD {
    public static void main(String[] args) {
	System.out.println(gcd(994, 426));
    }
    static long gcd(long m, long n) {
	while (m != 0 && n != 0) {
	    if (m > n) {
		m %= n;
	    }
	    else {
		n %= m;
	    }
	}
	if (m == 0) {
	    return n;
	}
	return m;
    }
}
