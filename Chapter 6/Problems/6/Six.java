public class Six {
    public static void main(String[] args) {
	Line l1 = new Line(2, 1);
	Line l2 = new Line(-.5, 1);
	System.out.println(l1.is_perpendicular_to(l2));
    }
}
