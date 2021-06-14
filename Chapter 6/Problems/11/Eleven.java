public class Eleven {
    public static void main(String[] args) {
	Day sunday = new Day("Sun");
	Day before = sunday.next();
	System.out.println(before);
    }
}
