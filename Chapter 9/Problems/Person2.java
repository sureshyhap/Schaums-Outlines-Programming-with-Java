public class Person2 implements Comparable {
    public Person2(int income) {
	this.income = income;
    }
    public int compareTo(Object object) {
	if (this == object) {
	    return 0;
	}
	if (!(object instanceof Person2)) {
	    throw new IllegalArgumentException();
	}
	Person2 other = (Person2) object;
	if (income < other.income) {
	    return -1;
	}
	else if (income > other.income) {
	    return 1;
	}
	else {
	    return 0;
	}
    }
    public int get_income() {
	return income;
    }
    
    private int income;
}
