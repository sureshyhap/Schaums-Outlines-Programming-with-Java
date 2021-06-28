public class Eleven {
    public static void main(String[] args) {
	Student ann = new Student(new Name("Ann", "Baker"), 'F', 16, 3.5);
	System.out.println(ann);
	ann.update(4, 'B');
	System.out.println(ann);
    }
}
