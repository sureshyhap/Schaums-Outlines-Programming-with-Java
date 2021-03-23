class Digits {
    public static void main(String[] args) {
	int n = 5814;
	int first = n / 1000;
	n %= 1000;
	int second = n / 100;
	n %= 100;
	int third = n / 10;
	n %= 10;
	int fourth = n;
	System.out.println("The digits of n are " + first + ", " + second +
			   ", " + third + ", and " + fourth);
    }
}
