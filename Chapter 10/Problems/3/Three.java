import java.util.*;

public class Three {
    public static void main(String[] args) {
	Collection<Integer> c = new ArrayList<Integer>();
	c.add(5);
	c.add(1);
	c.add(7);
	System.out.println(c);
	System.out.println(get_last(c));
	System.out.println(c);
    }
    public static Object get_last(Collection c) {
	Iterator it = c.iterator();
	Object element = null;
	while (it.hasNext()) {
	   element = it.next();
	}
	it.remove();
	return element;
    }
}
