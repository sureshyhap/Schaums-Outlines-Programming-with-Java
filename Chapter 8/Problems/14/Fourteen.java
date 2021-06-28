public class Fourteen {
    public static void main(String[] args) {
	Point p1 = new Point(-1, 0);
	Point p2 = new Point(-1, 10);
	Point p3 = new Point(5, 0);
	Triangle t = new Triangle(p1, p2, p3);
	System.out.println(t.area());
    }
}
