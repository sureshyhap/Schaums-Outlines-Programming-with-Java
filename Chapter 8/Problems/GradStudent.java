public class GradStudent extends CollegeStudent {
    public GradStudent(Name name, char sex, int credits, double gpa, int year, String degree) {
	super(name, sex, credits, gpa, year);
	this.degree = degree;
    }
    public String get_degree() {
	return degree;
    }
    public void set_degree(String new_degree) {
	degree = new_degree;
    }
    public String toString() {
	String s = super.toString();
	s += "\n" + degree;
	return s;
    }
    
    protected String degree;
}
