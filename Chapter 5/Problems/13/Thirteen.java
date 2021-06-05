class LCM {
    public static void main(String[] args) {
	System.out.println(lcm(24, 40));
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
    static long lcm(long m, long n) {
	return (m * n) / gcd(m, n);
    }
}
