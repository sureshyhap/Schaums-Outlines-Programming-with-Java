public class Rectangle3 extends Shape3 {
    public Rectangle3(int length, int width) {
	super(length, width);
    }
    public double get_area() {
	return x * y;
    }
    public double get_perimeter() {
	return 2 * (x + y);
    }
    public void scale(double sc_factor) {
	x *= sc_factor;
	y *= sc_factor;
    }
    
    // x and y are the length and width
}
