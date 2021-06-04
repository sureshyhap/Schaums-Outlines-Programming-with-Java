class Min_Max {
    public static void main(String[] args) {
	int n1 = Integer.parseInt(args[0]);
	int n2 = Integer.parseInt(args[1]);
	int n3 = Integer.parseInt(args[2]);
	int n4 = Integer.parseInt(args[3]);
	System.out.println(max(n1, n2, n3, n4));
	System.out.println(min(n1, n2, n3, n4));
    }
    static int max(int x, int y) {
	return x > y ? x : y;
    }    
    static int max(int x1, int x2, int x3, int x4) {
	return max(max(x1, x2), max(x3, x4));
    }
    static int min(int x, int y) {
	return x < y ? x : y;
    }    
    static int min(int x1, int x2, int x3, int x4) {
	return min(min(x1, x2), min(x3, x4));
    }    
}
