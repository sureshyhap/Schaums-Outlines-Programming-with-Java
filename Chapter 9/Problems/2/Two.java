public class Two {
    public static void main(String[] args) {
	Shape c = new Circle(1, 2, 5);
	System.out.println(c.get_x());
	System.out.println(c.get_area());
	c.scale(2);
	System.out.println(c.get_area());
	Shape r = new Rectangle(5, 11);
	System.out.println(r.get_perimeter());
	r.scale(5);
	System.out.println(r.get_perimeter());
    }
}
