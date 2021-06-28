public class Url {
    public Url(String site_name) {
	this.site_name = site_name;
    }
    public String toString() {
	String s = new String();
	s += "https://www." + site_name;
	return s;
    }
    
    private String site_name;
}
