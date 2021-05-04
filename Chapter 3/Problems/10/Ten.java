import java.util.Random;

class Grade {
    public static void main(String[] args) {
	// Grade from 60 to 99
	Random random = new Random();
	int grade_in_range = 60 + random.nextInt(40);
	System.out.println("Grade: " + grade_in_range);
	// Maximum of 2 characters for letter grade
	StringBuffer letter_grade = new StringBuffer(2);
	switch (grade_in_range / 10) {
	case 9:
	    letter_grade.append("A");
	    break;
	case 8:
	    letter_grade.append("B");
	    break;
	case 7:
	    letter_grade.append("C");
	    break;
	case 6:
	    letter_grade.append("D");
	    break;
	}
	switch (grade_in_range % 10) {
	case 9:
	case 8:
	    letter_grade.append("+");
	    break;
	case 1:
	case 0:
	    letter_grade.append("-");
	    break;
	}
	System.out.println(letter_grade);
    }
}
