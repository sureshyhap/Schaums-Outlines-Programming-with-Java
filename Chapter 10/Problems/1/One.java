import java.util.*;

public class One {
    public static void main(String[] args) {
	Collection<String> c = new ArrayList<String>();
	c.add("B");
	c.add("G");
	c.add("F");
	print(c);
    }
    public static void print(Collection c) {
	Iterator it = c.iterator();
	while (it.hasNext()) {
	    System.out.println(it.next());
	}
    }
}
