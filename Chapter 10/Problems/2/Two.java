import java.util.*;

public class Two {
    public static void main(String[] args) {
	Collection<String> c = new ArrayList<String>();
	c.add("Hello");
	c.add("How");
	c.add("Are");
	c.add("How");
	System.out.println(frequency(c, "How"));
    }
    public static int frequency(Collection c, Object x) {
	int freq = 0;
	Iterator it = c.iterator();
	while (it.hasNext()) {
	    if (it.next().equals(x)) {
		++freq;
	    }
	}
	return freq;
    }
}
