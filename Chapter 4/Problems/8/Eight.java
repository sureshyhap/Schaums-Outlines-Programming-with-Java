import java.util.Random;

class Pyth_Triples {
    public static void main(String[] args) {
	Random random = new Random();
	int first = 0, second = 0, third = 0;
	int f_sq = 0, s_sq = 0, t_sq = 0;
	int triple_count = 1;
	while (triple_count <= 8) {
	    first = 1 + random.nextInt(100);
	    second = 1 + random.nextInt(100);
	    third = 1 + random.nextInt(100);
	    f_sq = first * first;
	    s_sq = second * second;
	    t_sq = third * third;
	    if (f_sq + s_sq == t_sq) {
		System.out.println(triple_count + ". " + first + ", " + second + ", " + third +
				   "\t" + f_sq + " + " + s_sq + " = " + t_sq);
		++triple_count;
	    }
	    else {
		continue;
	    }
	}
    }
}
