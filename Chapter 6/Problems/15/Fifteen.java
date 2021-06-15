public class Fifteen {
    public static void main(String[] args) {
	Line l = new Line(0, 5);
	l.rotate(Math.PI / 2);
	System.out.println(l);
	Line l2 = new Line(10e16, 5);
	l2.rotate(Math.PI / 2);
	System.out.println(l2);
    }
}
