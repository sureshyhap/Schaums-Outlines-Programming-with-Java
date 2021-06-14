public class Day {
    public Day() {
	day_number = 0;
    }
    public Day(Day d) {
	day_number = d.day_number;
    }
    public Day(String s) {
	// Locates first two characters of day in DAYS
	// thus figuring out what day_number should be
	day_number = DAYS.indexOf(s.substring(0, 2).toUpperCase()) / 2;
    }
    public String toString() {
	switch (day_number) {
	case 0:
	    return "Sunday";
	case 1:
	    return "Monday";
	case 2:
	    return "Tuesday";
	case 3:
	    return "Wednesday";
	case 4:
	    return "Thursday";
	case 5:
	    return "Friday";
	default:
	    return "Saturday";
	}
    }
    public void advance(int n) {
	day_number = (day_number + n) % 7;
    }
    public Day prev() {
	// n is between 0 and 6
	int n = (day_number + 6) % 7;
	// 2 * n is between 0 and 12 which will
	// designate a day in DAYS
	return new Day(DAYS.substring(2 * n, 2 * n + 2));
    }
    public Day next() {
	int n = (day_number + 1) % 7;
	return new Day(DAYS.substring(2 * n, 2 * n + 2));	
    }
    private static final String DAYS = "SUMOTUWETHFRSA";
    private int day_number;
}
