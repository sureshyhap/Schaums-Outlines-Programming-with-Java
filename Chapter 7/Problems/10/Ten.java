public class Ten {
    public static void main(String[] args) {
	final int DIMENSION= 9;
	int[][] m = IntArrays.table(DIMENSION);
	for (int i = 0; i < DIMENSION; ++i) {
	    for (int j = 0; j < DIMENSION; ++j) {
		System.out.print(m[i][j] + ",");
	    }
	    System.out.println();
	}
    }
}
