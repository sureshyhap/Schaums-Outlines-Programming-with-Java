public class TwentyOne {
    public static void main(String[] args) {
	int[][] a = { {1, 2, 3, 4},
		      {5, 6, 7, 8},
		      {9, 10, 11, 12}
	};
	int[][] remove_1 = IntArrays.minor(a, 1, 2);
	for (int i = 0; i < remove_1.length; ++i) {
	    for (int j = 0; j < remove_1[0].length; ++j) {
		System.out.print(remove_1[i][j] + " ");
	    }
	    System.out.println();
	}
    }
}
