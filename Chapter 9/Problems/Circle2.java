public class Circle2 extends Shape2 implements Movable {
    public Circle2(double x, double y, double radius) {
	super(x, y);
	this.radius = radius;
    }
    public double get_radius() {
	return radius;
    }
    public double get_area() {
	return Math.PI * radius * radius;
    }
    public double get_perimeter() {
	return 2 * Math.PI * radius;
    }
    public void scale(double sc_factor) {
	radius *= sc_factor;
    }
    public void set_x(double x) {
	this.x = x;
    }
    public void set_y(double y) {
	this.y = y;
    }

    // x and y are the coordinates of the center
    protected double radius;
}
