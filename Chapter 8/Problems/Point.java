class Point {
    public Point(double x, double y) {
	this.x = x;
	this.y = y;
    }
    public boolean equals(Point p) {
	return (x == p.x && y == p.y);
    }
    public double get_x() {
	return x;
    }
    public double get_y() {
	return y;
    }
    public String toString() {
	return ("(" + x + ", " + y + ")");
    }
    public void translate(double dx, double dy) {
	x += dx;
	y += dy;
    }
    public void rotate(double theta) {
	double x2 = Math.round(((x * Math.cos(theta)) - (y * Math.sin(theta))));
	double y2 = Math.round(((x * Math.sin(theta)) + (y * Math.cos(theta))));
	x = x2;
	y = y2;
    }
    static double distance(Point p1, Point p2) {
	double d1 = (p2.get_x() - p1.get_x()) * (p2.get_x() - p1.get_x());
	double d2 = (p2.get_y() - p1.get_y()) * (p2.get_y() - p1.get_y());
	return Math.sqrt(d1 + d2);
    }
    private double x, y;
}
