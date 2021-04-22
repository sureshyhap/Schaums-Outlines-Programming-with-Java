import java.util.Random;

class Rand_Int_Max {
    public static void main(String[] args) {
	Random r = new Random();
	int first = r.nextInt();
	int second = r.nextInt();
	int third = r.nextInt();
	int fourth = r.nextInt();
	int max = (first > second ? first : second);
	max = (max > third ? max : third);
	max = (max > fourth ? max : fourth);
	System.out.println(first);
	System.out.println(second);
	System.out.println(third);
	System.out.println(fourth);
	System.out.println("The max is " + max);
    }
}
