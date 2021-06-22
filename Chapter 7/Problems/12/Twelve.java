public class Twelve {
    public static void main(String[] args) {
	int[][] a = { {4, 2, 6, 1},
		      {7, 12, 67, 2},
		      {1, 8, 4, 7}
	};
	IntArrays.print(IntArrays.column(a, 2));
    }
}
