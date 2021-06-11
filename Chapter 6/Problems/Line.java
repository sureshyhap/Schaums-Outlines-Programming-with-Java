class Line {
    public Line(double slope, double y_intercept) {
	this.slope = slope;
	this.y_intercept = y_intercept;
    }
    public Line(Point p, double slope) {
	this.slope = slope;
	y_intercept = p.get_y() - slope * p.get_x();
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
    private double slope, y_intercept;
}