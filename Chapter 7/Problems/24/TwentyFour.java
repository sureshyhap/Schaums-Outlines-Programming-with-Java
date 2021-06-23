public class TwentyFour {
    public static void main(String[] args) {
	int[][] a = { {1, 2, 3},
		      {4, 5, 6}
	};
	int[][] b = { {1, 2, 3},
		      {4, 5, 6}
	};
	int[][] c = { {1, 2, 3},
		      {4, 6, 6}
	};
	System.out.println(IntArrays.equals(a, b));
	System.out.println(IntArrays.equals(a, c));
    }
}
