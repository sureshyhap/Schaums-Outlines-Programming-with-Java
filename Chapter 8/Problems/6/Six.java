public class Six {
    public static void main(String[] args) {
	Person p = new Person("Suresh Yhap", 'M', "123-12-1234", new Phone("718", "807-6250"),
			      new Email("sureshyhap", "gmail.com"), new Url("google.com"));
	System.out.println(p);
	
    }
}
