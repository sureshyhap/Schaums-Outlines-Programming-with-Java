public class Thirteen {
    public static void main(String[] args) {
	int[] a = {3, 7, 1, 4, 8, 4, 10, 1, 3};
	a = IntArrays.delete(a, 4);
	IntArrays.print(a);
    }
}
