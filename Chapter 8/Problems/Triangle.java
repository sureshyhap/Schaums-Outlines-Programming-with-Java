public class Triangle extends Shape {
    public Triangle(Point first, Point second, Point third) {
	first_corner = first;
	second_corner = second;
	third_corner = third;
    }
    public double area() {
	double first_part = first_corner.get_x() * second_corner.get_y() +
	    second_corner.get_x() * third_corner.get_y() +
	    third_corner.get_x() * first_corner.get_y();
	double second_part = first_corner.get_y() * second_corner.get_x() +
	    second_corner.get_y() * third_corner.get_x() +
	    third_corner.get_y() * first_corner.get_x();
	return Math.abs(first_part - second_part) / 2;
	    
    }
    public double perimeter() {
	return Point.distance(first_corner, second_corner) +
	    Point.distance(first_corner, third_corner) +
	    Point.distance(second_corner, third_corner);
    }
    
    protected Point first_corner;
    protected Point second_corner;
    protected Point third_corner;
}
