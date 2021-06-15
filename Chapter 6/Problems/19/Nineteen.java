class Nineteen {
    public static void main(String[] args) {
	Circle c = new Circle(new Point(0, 0), 5);
	System.out.println("Area: " + c.area());
	System.out.println("Circumference: " + c.circumference());
	Point p = new Point(0, 0);
	Circle c2 = new Circle(p, 5);
	System.out.println(c.equals(c2));
	System.out.println(c);
    }
}
