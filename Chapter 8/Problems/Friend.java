public class Friend {
    public Friend(String name, String telephone) {
	this.name = name;
	this.telephone = telephone;
	insert(this);
    }
    public static void print() {
	Friend f = list;
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
    public String toString() {
	String s = new String(name + ": "  + telephone);
	return s;
    }	

    private static void insert(Friend f) {
	if (list == null) {
	    f.next = null;
	    list = f;
	}
	else {
	    Friend temp = list, temp2 = null;
	    while (temp != null && temp.name.compareTo(f.name) < 0) {
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
    protected String name;
    protected String telephone;
    protected Friend next;
    static Friend list;
}
