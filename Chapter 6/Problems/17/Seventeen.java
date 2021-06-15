public class Seventeen {
    public static void main(String[] args) {
	short m = 22;
	Short x = new Short(m);
	String s = x.toString();
	m = Short.parseShort(s);
	s = Short.toString(m);
	x = Short.decode(s);
    }
}
