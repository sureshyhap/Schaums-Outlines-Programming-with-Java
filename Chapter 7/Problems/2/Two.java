public class Two {
    public static void main(String[] args) {
	int[] a = {1, 4, 7, 9};
	System.out.println(IntArrays.is_ascending(a));
	System.out.println(IntArrays.is_descending(a));
	System.out.println(IntArrays.is_sorted(a));
	IntArrays.print(a);
	int[] a2 = IntArrays.random_int_array(5, 10);
	IntArrays.print(a2);
	int[] bigger = IntArrays.resized(a2, 10);
	IntArrays.print(bigger);
	int[] smaller = IntArrays.resized(a2, 2);
	IntArrays.print(smaller);
    }
}
