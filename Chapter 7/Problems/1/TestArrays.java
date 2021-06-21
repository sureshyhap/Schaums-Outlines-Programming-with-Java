public class TestArrays {
    public static void main(String[] args) {
	int[] ints;
	ints = new int[4];
	ints[0] = 22;
	ints[1] = 44;
	ints[2] = 66;
	ints[3] = 88;
	print(ints);
    }
    public static void print(int[] a) {
	for (int i = 0; i < a.length; ++i) {
	    System.out.print(a[i] + " ");
	}
	System.out.println();
    }
}
