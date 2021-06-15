public class Sixteen {
    public static void main(String[] args) {
	Line l1 = new Line(5, 4);
	Line l2 = new Line(new Point(-.8, 0), 5);
	Line l3 = new Line(new Point(-.8, 0), new Point(.6, 7));
	System.out.println(l1.equals(l2));
	System.out.println(l2.equals(l3));
    }
}
