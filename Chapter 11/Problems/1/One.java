class Main {
    public static void main(String[] args) {
	String[] a = {"ABC", "123", "0", ""};
	for (int i = 0; i < 4; ++i) {
	    try {
		String s = a[i];
		System.out.println("\ts: " + s);
		int n = Integer.parseInt(s);
		System.out.println("\tn: " + n);
		int m = 1234 / n;
		System.out.println("\tm: " + m);
	    } catch (NumberFormatException e) {
		System.err.println(e);
	    } catch (ArrayIndexOutOfBoundsException e) {
		System.err.println(e);
	    } catch (ArithmeticException e) {
		System.err.println(e);
	    } finally {
		System.out.println("\ti: " + i);
	    }
	}
	System.out.println("Goodbye");
    }
}
