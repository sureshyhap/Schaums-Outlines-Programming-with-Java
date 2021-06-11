public class One {
    public static void main(String[] args) {
	Point p = new Point(2, -3);
	System.out.println("p:" + p);
	Point q = new Point(2, -3);
	System.out.println("q:" + q);
	System.out.println("p.equals(q): " + p.equals(q));
	System.out.println("p == q: " + (p == q));
    }
}
