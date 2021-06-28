public class Phone {
    public Phone(String area_code, String number) {
	this.area_code = area_code;
	this.number = number;
    }
    public String toString() {
	String s = new String();
	s += "(" + area_code + ") ";
	s += number;
	return s;
    }

    private String area_code;
    private String number;
}
