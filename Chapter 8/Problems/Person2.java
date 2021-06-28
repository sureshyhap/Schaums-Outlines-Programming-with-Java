public class Person2 {
    public Person2(Name name, char sex) {
	this.name = name;
	this.sex = sex;
	this.name_str = name.get_first() + " " + name.get_last();
	++count;
	number = count;
    }
    public Person2(Name name, char sex, String id) {
	this(name, sex);
	this.id = id;
    }
    public Name get_name() {
	return name;
    }
    public char get_sex() {
	return sex;
    }
    public String get_id() {
	return id;
    }
    public void set_mother(Person2 mother) {
	this.mother = mother;
    }
    public void set_father(Person2 father) {
	this.father = father;
    }
    public String toString() {
	String s = new String(name + " (" + sex + ") " + "#" + number);
	if (id != null) {
	    s += "; id: " + id;
	}
	s += '\n';
	if (mother != null) {
	    tab += two_blanks;
	    s += tab + "mother: " + mother;
	    tab = tab.substring(2);
	}
	if (father != null) {
	    tab += two_blanks;
	    s += tab + "father: " + father;
	    tab = tab.substring(2);
	}
	return s;
    }

    protected Name name;
    protected String name_str;
    protected char sex;
    protected String id;
    protected Person2 mother;
    protected Person2 father;
    private final static String two_blanks = "  ";
    private static String tab = "";
    protected int number;
    protected static int count = 0;
}
