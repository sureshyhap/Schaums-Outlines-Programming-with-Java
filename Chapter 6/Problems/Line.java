class Line {
    public Line(double slope, double y_intercept) {
	this.slope = slope;
	this.y_intercept = y_intercept;
    }
    public Line(Point p, double slope) {
	this.slope = slope;
	y_intercept = p.get_y() - slope * p.get_x();
    }
    public Line(Point p1, Point p2) {
	slope = (p2.get_y() - p1.get_y()) / (p2.get_x() - p1.get_x());
	y_intercept = p1.get_y() - slope * p1.get_x();
    }
    public Line(Line l) {
	slope = l.slope;
	y_intercept = l.y_intercept;
    }
    public boolean contains(Point p) {
	return (p.get_y() == (slope * p.get_x() + y_intercept));
    }
    public boolean equals(Line l) {
	return (slope == l.slope && y_intercept == l.y_intercept);
    }
    public double get_slope() {
	return slope;
    }
    public double get_y_intercept() {
	return y_intercept;
    }
    public String toString() {
	return new String("y = " + slope + "x + " + y_intercept);
    }
    public boolean is_parallel_to(Line line) {
	return slope == line.slope;
    }
    public boolean is_perpendicular_to(Line line) {
	return ((slope * line.slope) == -1);
    }
    // y - dy = m(x - dx) + b
    // y = mx + (b - m * dx + dy)
    public void translate(double dx, double dy) {
	y_intercept = y_intercept - (slope * dx) + dy;
    }
    // m_2 = tan(arctan(m_1) + theta)
    //     = (m_1 + tan(theta)) / (1 - m_1 * tan(theta))
    public void rotate(double theta) {
	slope = (slope + Math.tan(theta)) / (1 - slope * Math.tan(theta));
    }
    public Line copy() {
	Line l = new Line(slope, y_intercept);
	return l;
    }
    private double slope, y_intercept;
}
