class Point {
    public Point(int x, int y) {
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
    public void translate(int dx, int dy) {
	x += dx;
	y += dy;
    }
    public void rotate(double theta) {
	double x2 = Math.round(((x * Math.cos(theta)) - (y * Math.sin(theta))));
	double y2 = Math.round(((x * Math.sin(theta)) + (y * Math.cos(theta))));
	x = x2;
	y = y2;
    }
    private double x, y;
}
