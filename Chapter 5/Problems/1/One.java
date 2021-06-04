class Babbage {
    public static void main(String[] args) {
	for (int i = 0; i < 10; ++i) {
	    System.out.println(babbage_func(i));
	}
    }
    public static int babbage_func(int x) {
	return (x * x) + x + 41;
    }
}
