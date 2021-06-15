public class Eighteen {
    public static void main(String[] args) {
	Month m = new Month("Octo");
	m.advance(1);
	System.out.println(m);	
	Month n1 = m.prev();
	System.out.println(n1);	
	Month n2 = m.next();
	System.out.println(n2);
    }
}
