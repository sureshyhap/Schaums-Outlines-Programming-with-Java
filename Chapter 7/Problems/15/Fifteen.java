public class Fifteen {
    public static void main(String[] args) {
	int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	int[] aa = new int[a.length];
	System.arraycopy(a, 0, aa, 0, a.length);
	IntArrays.rotate(a, 3);
	IntArrays.print(a);
	IntArrays.rotate(aa, -1);
	IntArrays.print(aa);
    }
}
