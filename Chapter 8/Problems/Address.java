public class Address {
    public Address(String street, String city, String state, String zip_code, String country) {
	this.street = street;
	this.city = city;
	this.state = state;
	this.zip_code = zip_code;
	this.country = country;
    }

    public String toString() {
	String s = new String();
	s += street + " ";
	s += city + " ";
	s += state + " ";
	s += zip_code + " ";
	s += country;
	return s;
    }
    
    private String street;
    private String city;
    private String state;
    private String zip_code;
    private String country;
}
