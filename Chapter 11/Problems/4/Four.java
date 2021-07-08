public class Four {
    public static void main(String[] args) {
	try {
	    methodA();
	} catch (ArithmeticException e) {
	    System.err.println(e);
	}
    }
    public static void methodA() {
	methodB();
    }
    public static void methodB() throws ArithmeticException {
	methodC();
    }
    public static void methodC() throws ArithmeticException {
	methodD();
    }
    public static void methodD() throws ArithmeticException {
	int n = 4 / 0;
    }
}
