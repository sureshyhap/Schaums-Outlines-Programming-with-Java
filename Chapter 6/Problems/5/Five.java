public class Five {
    public static void main(String[] args) {
	Line l1 = new Line(4, 5);
	System.out.println("l1: " + l1);
	Line l2 = new Line(new Point(1, 9), 4);
	System.out.println("l2: " + l2);
	System.out.println("l1.contains(-1, 1): " + l1.contains(new Point(-1, 1)));	
	System.out.println("l1.equals(l2): " + l1.equals(l2));
	Line l3 = new Line(4, 10);
	System.out.println("l3: " + l3);	
	System.out.println("l1.is_parallel_to(l3): " + l1.is_parallel_to(l3));
    }
}
