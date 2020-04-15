import java.util.Scanner;

public class Player {
	private String name;// Represents the Players name
	private int score;
	private int input;
	private String inputName;
	Scanner sc = new Scanner(System.in);
	// sc will help to take inputs from keyboard

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}


	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}
	public String getInputName() {
		return inputName;
	}

	public void setInputName(String inputName) {
		this.inputName = inputName;
	}

public void askName(int i) {// Will let the user enter his name
		System.out.println("Please enter your name player"+i);
		name = sc.nextLine();
	}

	public int getInput(Player player) {
		// This function lets the user do the selection among
		// ROCK PAPER SCISSORS
		// and return what has been selected
		//System.out.println(player.getName());
		System.out.println("Select  ROCK  PAPER SCISSOR for "+player.getName());

		String input = sc.next();
		input = input.toUpperCase();
		char c = input.charAt(0);
		// checking the 1st character in the input
		if (c == 'R')
		{    player.inputName="ROCK";
			return Driver.ROCK;
		}
		else if (c == 'P')
		{
			player.inputName="PAPER";
			return Driver.PAPER;
		}
		else if (c == 'S')
		{   player.inputName="SCISSORS";
			return Driver.SCISSORS;
		}
		else {
			getInput(player);
			return 0;
		}
	}

	
	
	
/*	public String getInput1(int i) {
		// This function lets the user do the selection among
		// ROCK PAPER SCISSORS
		// and return what has been selected
		System.out.println("Select  ROCK  PAPER SCISSOR for Player"+i);

		String input1 = sc.next();
		//input = input.toUpperCase();
		//char c = input.charAt(0);
		// checking the 1st character in the input
		return input1;
		}*/
	

	public boolean playAgain() {
		// This function will ask if the user wants to
		// play again and return true or false accordingly.
		sc=new Scanner(System.in);
		System.out.print("Do you want to play again? ");
		String userInput = sc.nextLine();
		userInput = userInput.toUpperCase();
		
		if(userInput.charAt(0)=='Y')
		   return(true);
		else
			return(false);
		
	}
}