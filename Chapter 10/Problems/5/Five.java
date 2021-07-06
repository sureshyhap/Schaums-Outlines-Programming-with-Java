import java.util.*;

public class Five {
    public static void main(String[] args) {
	Set<Integer> c = new HashSet<Integer>();
	c.add(5);
	c.add(1);
	c.add(2);
	System.out.println(c);
	remove_last(c);
	System.out.println(c);
    }
    public static void remove_last(Set set) {
	Iterator it = set.iterator();
	while (it.hasNext()) {
	    it.next();
	}
	it.remove();
    }
}
