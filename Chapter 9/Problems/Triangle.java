public class Triangle extends Shape {
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
	super(0, 0);
	this.x1 = x1;
	this.y1 = y1;
	this.x2 = x2;
	this.y2 = y2;
	this.x3 = x3;
	this.y3 = y3;
    }
    public double get_area() {
	double first_part = x1 * y2 + x2 * y3 + x3 * y1;
	double second_part = y1 * x2 + y2 * x3 + y3 * x1;
	return Math.abs(first_part - second_part) / 2;
    }
    public double get_perimeter() {
	double side1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	double side2 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
	double side3 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
	return side1 + side2 + side3;
    }
    public void scale(double sc_factor) {
	x1 *= sc_factor;
	y1 *= sc_factor;
	x2 *= sc_factor;
	y2 *= sc_factor;
	x3 *= sc_factor;
	y3 *= sc_factor;
    }
    
    protected double x1, y1, x2, y2, x3, y3;    
}
