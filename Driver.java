public class Driver {
	//These instance variables will act as constants through out the project
	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSORS = 3;
	public static int PLAYER1SCORE = 0;
	public static  int PLAYER2SCORE = 0;
	public static  int PLAYER3SCORE = 0;
	public static  int PLAYER4SCORE = 0;


	//This function will help to display who selected what
	public static void display(String who, int s) {
		switch (s) {
		case Driver.ROCK:
			System.out.print(who + " selected ROCK   ");
			break;
		case Driver.PAPER:
			System.out.print(who + " selected PAPER   ");
			break;
		case Driver.SCISSORS:
			System.out.print(who + " selected SCISSORS   ");
			break;
		default:
			break;
		}
	}
	//This function contains the actual buisness logic
	//and help to decide who won
	public static  int compareSelections(Player p1, Player p2) {
		int userSelection=p1.getInput();
		int computerSelection=p2.getInput();
		if(userSelection==computerSelection) return 0 ;
		switch (userSelection) {
		case ROCK:
			
			if(computerSelection == SCISSORS)
			{
				
				return 1;				

			}
			else
			return -1;
		case PAPER:
					
			if(computerSelection == ROCK)
			{
				return 1;				
				

			}
			else
				return -1;				



		case SCISSORS:
			
			if(computerSelection == PAPER)
				{ 
				
				return 1;				

				
				}
			else
				return -1;				

		} 
		return 0;
				
	}
		

}
