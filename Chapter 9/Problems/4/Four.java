public class Four {
    public static void main(String[] args) {
	Person2 first = new Person2(100000);
	Person2 second = new Person2(35000);
	Person2 third = new Person2(50000);
	Person2 fourth = new Person2(75000);
	Person2[] people = {first, second, third, fourth};
	sort(people);
	print(people);
    }
    public static void sort(Comparable[] c) {
	int length = c.length;
	for (int i = 1; i < length; ++i) {
	    Comparable element = c[i];
	    int j = 0;
	    for (j = i - 1; j >= 0 && c[i].compareTo(c[j]) < 0; --j) {
		c[j + 1] = c[j];
	    }
	    c[j + 1] = element;
	}
    }
    public static void print(Person2[] p) {
	for (int i = 0; i < p.length; ++i) {
	    System.out.println(p[i].get_income());
	}
    }
}
