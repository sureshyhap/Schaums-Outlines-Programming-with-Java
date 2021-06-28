public class Person {
    public Person(String name, char sex) {
	this.name = name;
	this.sex = sex;
    }
    public Person(String name, char sex, String id, Phone phone, Email email, Url url) {
	this(name, sex);
	this.id = id;
	this.phone = phone;
	this.email = email;
	this.url = url;
    }

    public String toString() {
	String s = new String();
	s += name + " ";
	s += "\"" + sex + "\" ";
	if (id != null) {
	    s += id + " ";
	}
	if (phone != null) {
	    s += phone + " ";
	}
	if (email != null) {
	    s += email + " ";
	}
	if (url != null) {
	    s += url + " ";
	}
	return s.trim();
    }
    
    protected String name;
    protected char sex;
    protected String id;
    protected Phone phone;
    protected Email email;
    protected Url url;   
}
