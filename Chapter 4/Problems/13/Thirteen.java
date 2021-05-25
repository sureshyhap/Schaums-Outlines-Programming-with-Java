import java.io.*;
import java.util.Random;

class RockScissorsPaper {
    public static void main(String[] args) throws IOException {
	System.out.println("Welcome to the Rock, Scissors, Paper game.");
	System.out.println("You and I will simultaneously pick one of those three choices");
	System.out.println("Rock breaks scissors, scissors cuts paper, and paper wraps rock");
	System.out.println("Enter Q to quit.");
	Random random = new Random();
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String input;
	int games_won = 0;
	int total_games = 0;
	double percent_won = 0;
	while (true) {
	    String player_choice;
	    System.out.print("Enter your choice: (R/S/P/Q): ");
	    input = in.readLine();
	    player_choice = input.toUpperCase();
	    if (player_choice.equals("Q")) {
		break;
	    }
	    System.out.print("\tYou chose ");
	    if (player_choice.equals("R")) {
		System.out.println("Rock");
	    }
	    else if (player_choice.equals("S")) {
		System.out.println("Scissors");
	    }
	    else if (player_choice.equals("P")) {
		System.out.println("Paper");
	    }	    
	    int comp_choice_int = random.nextInt(3);
	    String comp_choice = "";
	    if (comp_choice_int == 0) {
		comp_choice = "R";
	    }
	    else if (comp_choice_int == 1) {
		comp_choice = "S";
	    }
	    else if (comp_choice_int == 2) {
		comp_choice = "P";
	    }
	    System.out.print("\tI chose ");
	    if (comp_choice.equals("R")) {
		System.out.println("Rock");
	    }
	    else if (comp_choice.equals("S")) {
		System.out.println("Scissors");
	    }
	    else if (comp_choice.equals("P")) {
		System.out.println("Paper");
	    }
	    if (player_choice.equals(comp_choice)) {
		System.out.println("\tWe tied.");
	    }
	    else if ((player_choice.equals("R") && comp_choice.equals("S")) ||
		     (player_choice.equals("S") && comp_choice.equals("P")) ||
		     (player_choice.equals("P") && comp_choice.equals("R"))) {
		System.out.println("\tYou won.");
		++games_won;
	    }
	    else {
		System.out.println("\tI won.");
	    }
	    ++total_games;
	}
	percent_won = ((double) games_won) / total_games;
	System.out.println("You won " + games_won + " games.");
	System.out.println("You played " + total_games + " games.");
	if (total_games != 0) {
	    System.out.println("That is a " + percent_won * 100 + "% win rate.");
	}
    }
}
