public class CollegeStudent extends Student {
    public CollegeStudent(Name name, char sex, int credits, double gpa, int year) {
	super(name, sex, credits, gpa);
	this.year = year;
    }
    public int get_year() {
	return year;
    }
    public void set_year(int new_year) {
	year = new_year;
    }
    public String toString() {
	String s = super.toString();
	s += "\n" + year;
	return s;
    }
    protected int year;
}
