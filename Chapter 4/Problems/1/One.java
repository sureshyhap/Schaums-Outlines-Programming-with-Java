class Sine {
    public static void main(String[] args) {
	final int NUM_VALUES = 16;
	double x = 0.0, y = 0.0;
	System.out.println("\t" + x + "\t\t\t" + y);
	for (int i = 1; i < NUM_VALUES + 1; ++i) {
	    x = (i * Math.PI) / NUM_VALUES;
	    y = Math.sin(x);
	    System.out.println("\t" + x + "\t" + y);
	}
    }
}
