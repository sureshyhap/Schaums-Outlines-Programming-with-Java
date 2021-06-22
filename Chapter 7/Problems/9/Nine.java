public class Nine {
    public static void main(String[] args) {
	int[] a = {12, 14, 15, 20, 42};
	int[] aa = {12, 14, 15, 20, 42, 50};
	IntArrays.shuffle(a);
	IntArrays.print(a);
	IntArrays.shuffle(aa);
	IntArrays.print(aa);	
    }
}
