public class Eleven {
    public static void main(String[] args) {
	int[][] a = { {4, 2, 6, 1},
		      {7, 12, 67, 2},
		      {1, 8, 4, 7}
	};
	int[][] c = IntArrays.copy(a);
	for (int i = 0; i < c.length; ++i) {
	    for (int j = 0; j < c[0].length; ++j) {
		System.out.print(c[i][j] + " ");
	    }
	    System.out.println();
	}
    }
}
