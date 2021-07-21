import java.util.*;

public class Person implements java.io.Serializable {
    private static long next_id = 1000;
    private static final long MILLIS_PER_YR = (365.2422 * 24 * 60 * 60 * 1000);
    private String name;
    private final long id = ++next_id;
    private Date dob;
    private transient int age;
    private transient boolean age_computed;

    public Person(String name) {
	this.name = name;
    }
    public void compute_age() {
	if (dob != null) {
	    Date now = new Date();
	    age = (int)((now.getTime() - dob.getTime()) / MILLIS_PER_YR);
	    age_computed = true;
	}
    }
    public int get_age() {
	if (!age_computed) {
	    compute_age();
	}
	return age;
    }
    public void set_dob(int year, int month, int day) {
	Calendar cal = new GregorianCalendar(year, month - 1, day);
	this.dob = cal.getTime();
    }
    public String toString() {
	return name + ", " + id + ", " + age;
    }
}
