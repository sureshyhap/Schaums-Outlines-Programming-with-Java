public class Eighteen {
    public static void main(String[] args) {
	double[] data = {610, 790, 420, 540};
	double[] z = IntArrays.z_scores(data);
	System.out.print("{");
	for (int i = 0; i < z.length; ++i) {
	    System.out.print(z[i] + ",");
	}
	System.out.println("}");
    }
}
