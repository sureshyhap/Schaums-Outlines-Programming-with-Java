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
