public class Email {
    public Email(String user_name, String website) {
	this.user_name = user_name;
	this.website = website;
    }
    public String toString() {
	String s = new String();
	s += user_name + "@";
	s += website;
	return s;
    }

    private String user_name;
    private String website;
}
