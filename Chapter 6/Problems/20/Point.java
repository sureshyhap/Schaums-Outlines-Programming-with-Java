class Point {
    public Point(double r, double theta) {
	if (r >= 0) {
	    this.r = r;
	}
	else {
	    this.r = 0;
	}
	if (theta >= 0 && theta < 2 * Math.PI) {
	    this.theta = theta;
	}
	else {
	    this.theta = 0;
	}
    }
    public boolean equals(Point p) {
	return (r == p.r && theta == p.theta);
    }
    public double get_r() {
	return r;
    }
    public double get_theta() {
	return theta;
    }
    public String toString() {
	return ("(" + r + ", " + theta + ")");
    }
    public void extend(double dr) {
	if (dr >= 0 || (Math.abs(dr) <= r)) {
	    r += dr;
	}
    }
    public void rotate(double d_theta) {
	double new_angle = theta + d_theta;
	if (new_angle >= 0 && new_angle < 2 * Math.PI) {
	    theta = new_angle;
	}
    }
    private double r, theta;
}
