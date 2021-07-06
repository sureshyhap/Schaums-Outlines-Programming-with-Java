import java.util.*;

public class Four {
    public static void main(String[] args) {
	Collection<Double> c = new ArrayList<Double>();
	c.add(3.14);
	c.add(2.718);
	c.add(1.414);
	System.out.println(test_get_element_at(c, 1));
    }
    public static Object test_get_element_at(Collection c, int index) {
	int present_index = -1;
	Iterator it = c.iterator();
	Object element = null;
	while (it.hasNext()) {
	    element = it.next();
	    ++present_index;
	    if (present_index == index) {
		return element;
	    }
	}
	return null;
    }
}

    
