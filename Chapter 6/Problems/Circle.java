class Circle {
    public Circle(Point center, double radius) {
	this.center = center;
	this.radius = radius;
    }
    public Circle(Circle c) {
	center = c.center;
	radius = c.radius;
    }
    public Point get_center() {
	return center;
    }
    public double get_radius() {
	return radius;
    }
    public double area() {
	return Math.PI * radius * radius;
    }
    public double circumference() {
	return 2 * Math.PI * radius;
    }
    public boolean equals(Circle c) {
	if (radius == c.radius && center.equals(c.center)) {
	    return true;
	}
	else {
	    return false;
	}
    }
    public String toString() {
	String s = new String("(x - " + center.get_x() + ")^2 + " +
			      "(y - " + center.get_y() + ")^2 = " +
			      radius * radius);
	return s;
    }
    public void translate(double dx, double dy) {
	center.translate(dx, dy);
    }
    private Point center;
    private double radius;
}
