import java.util.Random;

class Average {
    public static void main(String[] args) {
	Random random = new Random();
	double sum = 0.0, average = 0.0;
	int num = 0;
	for (int i = 0; i < 5; ++i) {
	    num = random.nextInt();
	    sum += num;
	}
	average = sum / 5;
	System.out.println("average = " + average);
    }
}
