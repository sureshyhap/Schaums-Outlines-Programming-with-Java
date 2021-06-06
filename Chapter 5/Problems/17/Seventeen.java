class GCD {
    public static void main(String[] args) {
	System.out.println(gcd(994, 426));
	System.out.println(gcd_rec(994, 426));	
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
    public static long gcd_rec(long m, long n) {
	if (m == 0) {
	    return n;
	}
	else if (n == 0) {
	    return m;
	}
	if (m > n) {
	    return gcd_rec(m % n, n);
	}
	else {
	    return gcd_rec(m, n % m);
	}
    }
}
