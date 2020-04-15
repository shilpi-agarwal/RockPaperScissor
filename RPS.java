public class RPS {
	//Instance variables declaration
	private Player player1;
	private Player player2;
	private Player player3;
	private Player player4;

	private int playerScore;
	private int computerScore;
	private int numberOfGames;

	//Default Constructor initializing the instance variables
	public RPS() {
		player1 = new Player();
		player2 = new Player();
		player3 = new Player();
		player4 = new Player();

		
		playerScore = 0;
		computerScore = 0;
		numberOfGames = 0;
	}
	public static void main(String[] args) {

		RPS rps = new RPS();//Initialization occured.
		rps.getplayerName();//Getting user name
		rps.startGame();
	}
	//This function is called recursively till the player wants to play.
	//It is even exited if the user of computer completes the first 5 wins.
	public void startGame() {
		
	/*	player1.setInput(player1.getInput1(1));
		player2.setInput(player2.getInput1(2));
		player3.setInput(player3.getInput1(3));
		player4.setInput(player4.getInput1(4));*/
		
		int playerinput1 = player1.getInput(player1);
		int playerinput2 = player2.getInput(player2);
		int playerinput3 = player3.getInput(player3);
		int playerinput4 = player4.getInput(player4);
		player1.setInput(playerinput1);
		player2.setInput(playerinput2);
		player3.setInput(playerinput3);
		player4.setInput(playerinput4);

		
		Driver.display(player1.getName(), playerinput1);
		Driver.display(player2.getName(), playerinput2);

		Driver.display(player3.getName(), playerinput3);

		Driver.display(player4.getName(), playerinput4);

		int compareResult=Driver.compareSelections(player1, player2);
		countScore(compareResult,player1,player2);
		
		int compareResult1=Driver.compareSelections(player1, player3);
		countScore(compareResult1,player1,player3);
		
		int compareResult2=Driver.compareSelections(player1, player4);
		countScore(compareResult2,player1,player4);
		
		int compareResult3=Driver.compareSelections(player2, player3);
		countScore(compareResult3,player2,player3);
		
		int compareResult4=Driver.compareSelections(player2, player4);
		countScore(compareResult4,player2,player4);
		
		int compareResult5=Driver.compareSelections(player3, player4);
		countScore(compareResult5,player3,player4);
		
		
		System.out.println(player1.getName()+":"+player1.getInput()+":"+player1.getScore());
		System.out.println(player2.getName()+":"+player2.getInput()+":"+player2.getScore());

		System.out.println(player3.getName()+":"+player3.getInput()+":"+player3.getScore());

		System.out.println(player4.getName()+":"+player4.getInput()+":"+player4.getScore());

		numberOfGames++;
		if (player1.playAgain()) {
			System.out.println();
			startGame();
		} else {
			printStats();
		}
		if(numberOfGames==5)
		{   System.out.println("Game Over...");
			printStats();
		}
	}
		//helps to get the users name
	public void getplayerName() {
		
		player1.askName(1);
		player2.askName(2);
		player3.askName(3);
		player4.askName(4);
	}
	//Prints the result.
	public void printStats()
	{
		System.out.println("Number of games played is "+numberOfGames);
		System.out.println(player1.getName()+"'s score "+player1.getScore());
		System.out.println(player2.getName()+"'s score "+player2.getScore());
		System.out.println(player3.getName()+"'s score "+player3.getScore());
		System.out.println(player4.getName()+"'s score "+player4.getScore());
		if(player1.getScore()==5)
		{
			System.out.println(player1.getName()+" HAS WON THE GAME.............");

			new RPS();
		}
		if(player2.getScore()==5)
		{
			System.out.println(player2.getName()+" HAS WON THE GAME.............");
			//printStats();
			new RPS();
		}
		if(player3.getScore()==5)
		{
			System.out.println(player3.getName()+" HAS WON THE GAME.............");
			//printStats();
			new RPS();
		}
		if(player4.getScore()==5)
		{
			System.out.println(player4.getName()+" HAS WON THE GAME.............");
			//printStats();
			new RPS();
		}
		
	}
	
	public void countScore(int compareResult,Player player1,Player player2)
	{
		//System.out.println("compareResult"+compareResult);
		switch (compareResult) {
		case 0: // Tie
			System.out.println("Tie!");
			break;
		case 1: 
			playerScore=player1.getScore();
			playerScore++;
			player1.setScore(playerScore);
			break;
		case -1: 
			computerScore=player2.getScore();
			computerScore++;
			player2.setScore(computerScore);
			
			break;
		}
		
	}
	}


