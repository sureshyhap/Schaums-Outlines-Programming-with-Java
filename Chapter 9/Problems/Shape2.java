public abstract class Shape2 implements Geometric, Scalable {
    public Shape2(double x, double y) {
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

    protected double x, y;
}
