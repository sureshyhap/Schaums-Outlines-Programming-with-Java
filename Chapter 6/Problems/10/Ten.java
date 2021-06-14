public class Ten {
    public static void main(String[] args) {
	Wallet w = new Wallet();
	w.insert(183);
	System.out.println(w);
	w.remove(77);
	System.out.println(w);
    }
}
