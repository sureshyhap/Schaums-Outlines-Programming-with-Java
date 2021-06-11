class Point {
    public Point(int x, int y, int z) {
	this.x = x;
	this.y = y;
	this.z = z;
    }
    public boolean equals(Point p) {
	return (x == p.x && y == p.y && z == p.z);
    }
    public double get_x() {
	return x;
    }
    public double get_y() {
	return y;
    }
    public double get_z() {
	return z;
    }
    public String toString() {
	return ("(" + x + ", " + y + ", " + z + ")");
    }
    public void translate(int dx, int dy, int dz) {
	x += dx;
	y += dy;
	z += dz;
    }
    public void rotate(double theta) {
	double x2 = Math.round(((x * Math.cos(theta)) - (y * Math.sin(theta))));
	double y2 = Math.round(((x * Math.sin(theta)) + (y * Math.cos(theta))));
	x = x2;
	y = y2;
    }
    private double x, y, z;
}
