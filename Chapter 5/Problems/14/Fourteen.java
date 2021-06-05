class Floor {
    public static void main(String[] args) {
	System.out.println(floor((float)2.71828));
	System.out.println(floor((float)-3.3));
    }
    static int floor(float x) {
	if (x > 0) {
	    return (int) x;
	}
	else if (x < 0) {
	    return ((int) x) - 1;
	}
	return 0;
    }
}
