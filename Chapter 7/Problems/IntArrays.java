import java.util.Random;

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
    
    private static Random random = new Random();
}
