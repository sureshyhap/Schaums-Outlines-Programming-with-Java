public class Nine {
    public static void main(String[] args) {
	Purse p = new Purse();
	p.insert(0.48);
	System.out.println(p);
	p.insert(0.93);
	System.out.println(p);
	p.remove(0.57);
	System.out.println(p);
	p.remove(1.00);
	System.out.println(p);
    }
}
