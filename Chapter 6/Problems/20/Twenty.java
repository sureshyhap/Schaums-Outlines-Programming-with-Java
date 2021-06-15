public class Twenty {
    public static void main(String[] args) {
	Point p = new Point(5, Math.PI / 4);
	p.extend(4);
	p.rotate(Math.PI / 2);
	System.out.println(p);
    }
}
