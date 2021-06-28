public class Friend2 extends Person2 {
    public Friend2(String first, String last, String telephone, char sex) {
	super(new Name(first, last), sex);
	this.name_str = first + " " + last;
	this.sex = sex;
	this.telephone = telephone;
	insert(this);
    }
    public static void print() {
	Friend2 f = list;
	if (f == null) {
	    System.out.println("Empty List");
	    return;
	}
	else {
	    while (f != null) {
		System.out.println(f);
		f = f.next;
	    }
	}
    }    
    public String get_telephone() {
	return telephone;
    }
    public void set_telephone(String telephone) {
	this.telephone = telephone;
    }
    public String toString() {
	String s = super.toString();
	return s += telephone;	
    }

    private static void insert(Friend2 f) {
	if (list == null) {
	    f.next = null;
	    list = f;
	}
	else {
	    Friend2 temp = list, temp2 = null;
	    while (temp != null && temp.name_str.compareTo(f.name_str) < 0) {
		temp2 = temp;
		temp = temp.next;
	    }
	    f.next = temp;
	    if (temp2 != null) {
		temp2.next = f;
	    }
	    else {
		list = f;
	    }
	}
    }
    protected String telephone;
    protected Friend2 next;
    static Friend2 list;
}
