public abstract class Shape3 implements Geometric, Movable, Scalable, Colored {
    public Shape3(double x, double y) {
	this.x = x;
	this.y = y;
    }
    public abstract double get_area();
    public abstract double get_perimeter();
    public abstract void scale(double sc_factor);
    public double get_x() {
	return x;
    }
    public double get_y() {
	return y;
    }
    public void set_x(double x) {
	this.x = x;
    }
    public void set_y(double y) {
	this.y = y;
    }
    public String get_color() {
	return color;
    }
    public void set_color(String s) {
	color = s;
    }


    protected double x, y;
    protected String color;
}
