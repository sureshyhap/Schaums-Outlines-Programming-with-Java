import java.util.*;

public class Six {
    public static void main(String[] args) {
	Set<String> s = new HashSet<String>();
	s.add("Hello");
	s.add("How");
	s.add("Are");
	s.add("You");
	System.out.println(s);	
	remove_odd(s);
	System.out.println(s);
    }
    public static void remove_odd(Set set) {
	Iterator it = set.iterator();
	int index = 0;
	while (it.hasNext()) {
	    if (index % 2 != 0) {
		it.remove();
	    }
	    it.next();
	    ++index;
	}
    }
}
