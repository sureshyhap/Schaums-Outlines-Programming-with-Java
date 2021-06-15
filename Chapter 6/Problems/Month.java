class Month {
    public Month() {
	month_number = 0;
    }
    public Month(Month m) {
	month_number = m.month_number;
    }
    public Month(String s) {
	// Locates first two characters of month in MONTHS
	// thus figuring out what month_number should be
	month_number = MONTHS.indexOf(s.substring(0, 3).toUpperCase()) / 3;
    }
    public String toString() {
	switch (month_number) {
	case 0:
	    return "January";
	case 1:
	    return "February";
	case 2:
	    return "March";
	case 3:
	    return "April";
	case 4:
	    return "May";
	case 5:
	    return "June";
	case 6:
	    return "July";
	case 7:
	    return "August";
	case 8:
	    return "September";
	case 9:
	    return "October";
	case 10:
	    return "November";
	default:
	    return "December";
	}
    }
    public void advance(int n) {
	month_number = (month_number + n) % 12;
    }
    public Month prev() {
	// n is between 0 and 11
	int n = (month_number + 11) % 12;
	// 3 * n is between 0 and 33 which will
	// designate a month in MONTHS
	return new Month(MONTHS.substring(3 * n, 3 * n + 3));
    }
    public Month next() {
	int n = (month_number + 1) % 12;
	return new Month(MONTHS.substring(3 * n, 3 * n + 3));	
    }
    private static final String MONTHS = "JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC";
    private int month_number;
}
