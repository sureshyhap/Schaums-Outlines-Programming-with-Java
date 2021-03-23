class Wrong {
    "This does string concatenation because the integers are converted to Strings"
    public static void main(String[] args) {
	int n = 1000000000;
	System.out.println("One million:\t" + n);
	System.out.println("Two million:\t" + n + n);
	System.out.println("Three million:\t" + n + n + n);
    }
}
