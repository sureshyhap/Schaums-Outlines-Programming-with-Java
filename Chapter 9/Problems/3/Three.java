public class Three {
    public static void main(String[] args) {
	String[] arr = {"AB", "CD"};
	Human h = new Human(5, 10, "Joseph Yhap", arr);
	String s = h.get_drivers_license();
	System.out.println(s);
	String[] v = h.get_VINs();
	for (int i = 0; i < v.length; ++i) {
	    System.out.print(v[i] + " ");
	}
	System.out.println();
    }
}
