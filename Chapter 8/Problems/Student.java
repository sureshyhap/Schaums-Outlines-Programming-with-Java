public class Student extends Person2 {
    public Student(Name name, char sex, int credits, double gpa) {
	super(name, sex);
	this.credits = credits;
	this.gpa = gpa;
    }
    public int get_credits() {
	return credits;
    }
    public double get_gpa() {
	return gpa;
    }
    public String toString() {
	String s;
	s = super.toString();
	s += "Credits: " + credits;
	s += "\nGPA: " + gpa;
	return s;
    }
    public void update(int credit, char grade) {
	int grade_value = 0;
	switch (grade) {
	case 'A':
	    grade_value = 4;
	    break;
	case 'B':
	    grade_value = 3;
	    break;
	case 'C':
	    grade_value = 2;
	    break;
	case 'D':
	    grade_value = 1;
	    break;
	default:
	    grade_value = 0;
	    break;
	}
	double new_value = credits * gpa + credit * grade_value;
	gpa = new_value / (credits + credit);
	credits += credit;
    }

    protected int credits;
    protected double gpa;
}
