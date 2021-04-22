import java.util.Random;

class Ran_Pos {
    public static void main(String[] args) {
	Random r = new Random();
	int x = r.nextInt();
	boolean is_pos = (x > 0);
	if (is_pos) {
	    System.out.println(x + " is positive");
	}
    }
}
