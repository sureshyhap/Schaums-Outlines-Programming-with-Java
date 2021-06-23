import java.util.Random;
import java.util.Arrays;

public class IntArrays {
    public static boolean is_ascending(int[] a) {
	for (int i = 0; i < a.length - 1; ++i) {
	    if (a[i + 1] < a[i]) {
		return false;
	    }
	}
	return true;
    }
    public static boolean is_descending(int[] a) {
	for (int i = 0; i < a.length - 1; ++i) {
	    if (a[i + 1] > a[i]) {
		return false;
	    }
	}
	return true;
    }
    public static boolean is_sorted(int[] a) {
	if (is_ascending(a) || is_descending(a)) {
	    return true;
	}
	else {
	    return false;
	}
    }
    public static void print(int[] a) {
	if (a == null || a.length == 0) {
	    return;
	}
	System.out.print("{" + a[0]);
	for (int i = 1; i < a.length; ++i) {
	    System.out.print("," + a[i]);
	}
	System.out.println("}");
    }
    // Find a better way to print with different types
    public static void print(double[] a) {
	if (a == null || a.length == 0) {
	    return;
	}
	System.out.print("{" + a[0]);
	for (int i = 1; i < a.length; ++i) {
	    System.out.print("," + a[i]);
	}
	System.out.println("}");
    }    
    public static void print(int[][] a) {
	if (a == null || a.length == 0) {
	    return;
	}
	for (int i = 0; i < a.length; ++i) {
	    for (int j = 0; j < a[0].length; ++j) {
		System.out.print(a[i][j] + " ");
	    }
	    System.out.println();
	}
    }
    // Find a better way to print with different types
    public static void print(double[][] a) {
	if (a == null || a.length == 0) {
	    return;
	}
	for (int i = 0; i < a.length; ++i) {
	    for (int j = 0; j < a[0].length; ++j) {
		System.out.print(a[i][j] + " ");
	    }
	    System.out.println();
	}
    }    
    public static int[] random_int_array(int length, int range) {
	int[] rand_nums = new int[length];
	for (int i = 0; i < length; ++i) {
	    rand_nums[i] = random.nextInt(range);
	}
	return rand_nums;
    }
    public static int[] resized(int[] a, int length) {
	int[] aa = new int[length];
	int smaller_length = (length < a.length ? length : a.length);
	System.arraycopy(a, 0, aa, 0, smaller_length);
	return aa;
    }
    public static void swap(int[] a, int i, int j) {
	int temp = a[i];
	a[i] = a[j];
	a[j] = temp;
    }
    static boolean has_duplicates(int[] a) {
	for (int i = 0; i < a.length; ++i) {
	    for (int j = i + 1; j < a.length; ++j) {
		if (a[j] == a[i]) {
		    return true;
		}
	    }
	}
	return false;
    }
    static double sum(double[] x) {
	double s = 0;
	for (int i = 0; i < x.length; ++i) {
	    s += x[i];
	}
	return s;
    }
    static double max(double[] x) {
	double m = x[0];
	for (int i = 1; i < x.length; ++i) {
	    if (x[i] > m) {
		m = x[i];
	    }
	}
	return m;
    }
    static double range(double[] x) {
	double min = x[0], max = x[0];
	for (int i = 1; i < x.length; ++i) {
	    if (x[i] < min) {
		min = x[i];
	    }
	    if (x[i] > max) {
		max = x[i];
	    }
	}
	return max - min;
    }
    static int[] insert(int[] a, int x) {
	if (!is_sorted(a)) {
	    return null;
	}
	int[] new_arr = new int[a.length + 1];
	if (is_ascending(a)) {
	    for (int i = 0; i < a.length; ++i) {
		if (a[i] < x) {
		    new_arr[i] = a[i];
		}
		else {
		    new_arr[i] = x;
		    System.arraycopy(a, i, new_arr, i + 1, a.length - i);
		    break;
		}
	    }
	}
	else {
	    for (int i = 0; i < a.length; ++i) {
		if (a[i] > x) {
		    new_arr[i] = a[i];
		}
		else {
		    new_arr[i] = x;
		    System.arraycopy(a, i, new_arr, i + 1, a.length - i);
		    break;
		}
	    }	    
	}
	return new_arr;
    }
    static int[] unique(int[] a) {
	if (a == null || a.length == 0) {
	    return null;
	}
	Arrays.sort(a);
	int[] aa = new int[a.length];
	aa[0] = a[0];
	int unique_elements = 1;
	for (int i = 1; i < a.length; ++i) {
	    if (a[i] == a[i - 1]) {
		continue;
	    }
	    else {
		aa[unique_elements++] = a[i];
	    }
	}
	return resized(aa, unique_elements);
    }
    static void shuffle(int[] a) {	
	int aa[] = new int[a.length];
	int i = 0, j = 0, k = a.length / 2;
	while (j < a.length / 2 && k < a.length) {
	    aa[i++] = a[j++];
	    aa[i++] = a[k++];
	}
	if (k < a.length) {
	    aa[i++] = a[k];
	}
	System.arraycopy(aa, 0, a, 0, i);
    }
    static int[][] table(int n) {
	int[][] mult = new int[n][n];
	for (int i = 0; i < n; ++i) {
	    for (int j = 0; j < n; ++j) {
		mult[i][j] = (i + 1) * (j + 1);
	    }
	}
	return mult;
    }
    static int[][] copy(int[][] a) {
	int[][] c = new int[a.length][a[0].length];
	for (int i = 0; i < a.length; ++i) {
	    for (int j = 0; j < a[0].length; ++j) {
		c[i][j] = a[i][j];
	    }
	}
	return c;
    }
    static int[] column(int[][] a, int j) {
	int[] c = new int[a.length];
	int k = 0;
	for (int i = 0; i < a.length; ++i) {
	    c[k++] = a[i][j];
	}
	return c;
    }
    static int[] delete(int[] a, int x) {
	int[] aa = new int[a.length];
	int num_elements = 0;
	for (int i = 0; i < a.length; ++i) {
	    if (a[i] != x) {
		aa[num_elements++] = a[i];
	    }
	}
	int[] aaa = new int[num_elements];
	System.arraycopy(aa, 0, aaa, 0, num_elements);
	return aaa;
    }
    static void reverse(int[] a) {
	int[] aa = new int[a.length];
	for (int i = 0; i < a.length; ++i) {
	    aa[i] = a[a.length - i - 1];
	}
	System.arraycopy(aa, 0, a, 0, a.length);
    }
    static void rotate(int[] a, int d) {
	int[] aa = new int[a.length];
	int k = 0;
	if (d > 0) {
	    for (int i = a.length - d; i < a.length; ++i) {
		aa[k++] = a[i];
	    }
	    for (int i = 0; i < a.length - d; ++i) {
		aa[k++] = a[i];
	    }
	}
	else if (d < 0) {
	    int dd = -d;
	    for (int i = dd; i < a.length; ++i) {
		aa[k++] = a[i];
	    }
	    for (int i = 0; i < dd; ++i) {
		aa[k++] = a[i];
	    }
	}
	System.arraycopy(aa, 0, a, 0, a.length);
    }
    static double mean(double[] a) {
	return (sum(a) / a.length);
    }
    static double standard_deviation(double[] a) {
	double x_bar = mean(a);
	double sum = 0;
	for (int i = 0; i < a.length; ++i) {
	    sum += ((a[i] - x_bar) * (a[i] - x_bar));
	}
	return Math.sqrt(sum / (a.length - 1));
    }
    static double[] z_scores(double[] a) {
	double[] z_sc = new double[a.length];
	for (int i = 0; i < a.length; ++i) {
	    z_sc[i] = (a[i] - mean(a)) / (standard_deviation(a));
	}
	return z_sc;
    }
    static int[] row(int[][] a, int i) {
	return a[i];
    }
    static int[][] minor(int[][] a, int i, int j) {
	int[][] result = delete_col(delete_row(a, i), j);	
	return result;
    }
    static void swap(int[][] a, int i1, int j1, int i2, int j2) {
	int temp = a[i1][j1];
	a[i1][j1] = a[i2][j2];
	a[i2][j2] = temp;
    }
    static int[][] random_int_array(int r, int c, int range) {
	int[][] a = new int[r][c];
	for (int i = 0; i < r; ++i) {
	    for (int j = 0; j < c; ++j) {
		a[i][j] = random.nextInt(range);
	    }
	}
	return a;
    }
    static boolean equals(int[][] a, int[][] b) {
	if ((a.length != b.length) || (a[0].length != b[0].length)) {
	    return false;
	}
	for (int i = 0; i < a.length; ++i) {
	    for (int j = 0; j < a[0].length; ++j) {
		if (a[i][j] != b[i][j]) {
		    return false;
		}
	    }
	}
	return true;
    }
    static double inner_product(double[] x, double[] y) {
	// Assumes lengths are equal
	double sum = 0;
	for (int i = 0; i < x.length; ++i) {
	    sum += (x[i] * y[i]);
	}
	return sum;
    }
    static double[][] outer_product(double[] x, double[] y) {
	// Assumes lengths are equal
	double[][] result = new double[x.length][y.length];
	for (int i = 0; i < x.length; ++i) {
	    for (int j = 0; j < y.length; ++j) {
		result[i][j] = x[i] * y[j];
	    }
	}
	return result;
    }
    static int[][] transpose(int[][] a) {
	int[][] result = new int[a[0].length][a.length];
	for (int i = 0; i < a.length; ++i) {
	    for (int j = 0; j < a[0].length; ++j) {
		result[j][i] = a[i][j];
	    }
	}
	return result;
    }
    static int[][] pascals_triangle(int n) {
	int[][] result = new int[n + 1][n + 1];
	for (int i = 0; i <=n; ++i) {
	    for (int j = 0; j <= i; ++j) {
		if (j == 0 || j == i) {
		    result[i][j] = 1;
		}
		else {
		    result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
		}
	    }
	}
	return result;
    }
    static int[] fibonacci(int n) {
	int[] result = new int[n + 1];
	result[0] = 1;
	result[1] = 1;
	if (n < 2) {
	    return result;
	}
	for (int i = 2; i <= n; ++i) {
	    result[i] = result[i - 1] + result[i - 2];
	}
	return result;
    }
    static int[] prime(int n) {
	int[] p = new int[n + 1];
	p[0] = 2;
	int num_primes = 1;
	int num_to_test = 3;
	boolean is_prime = true;
	while (num_primes <= n) {
	    int prev = 1;
	    // Only have to test if previous primes are factors
	    // because every composite number has a prime factorization
	    while (p[prev] != 0) {
		if (num_to_test % p[prev] == 0) {
		    is_prime = false;
		    break;
		}
		++prev;
	    }
	    if (is_prime) {
		p[prev] = num_to_test;
		++num_primes;
	    }
	    else {
		is_prime = true;
	    }
	    num_to_test += 2;
	}
	return p;
    }
    
    ////////////////////////////////////////////////////////
    
    private static int[][] delete_row(int[][] a, int row) {
	int[][] result = new int[a.length - 1][a[0].length];
	int k = 0;
	for (int i = 0; i < a.length; ++i) {
	    if (i != row) {
		System.arraycopy(a[i], 0, result[k++], 0, a[0].length);
	    }
	}
	return result;
    }
    private static int[][] delete_col(int[][] a, int column) {
	int[][] result = new int[a.length][a[0].length - 1];
	for (int i = 0; i < a.length; ++i) {
	    int k = 0;
	    for (int j = 0; j < a[0].length; ++j) {
		if (j != column) {
		    result[i][k++] = a[i][j];
		}
	    }
	}
	return result;
    }
    private static Random random = new Random();
}
