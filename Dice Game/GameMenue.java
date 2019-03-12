import java.util.Scanner;
public class GameMenue
{
	public void startMenue() throws InterruptedException
	{
		Scanner scan = new Scanner(System.in);
		DiceInARow game1 = new DiceInARow();
		Game2 game2 = new Game2();
		Game3 game3 = new Game3();
		Game4 game4 = new Game4();
		Game5 game5 = new Game5();
		Game6 game6 = new Game6();
		int choiceNumber = 0;

		
		while(choiceNumber != 8)
		{
			printMenuChoices();
			choiceNumber = readChoiceNumber();
			switch (choiceNumber)
			{
			case 1:
				game1.DiceInARowMethod();
				break;
			case 2:
				game2.Game2Method();
				break;
			case 3:
				game3.Game3Method();
				break;
			case 4:
				game4.Game4Method();
				break;
			case 5:
				game5.Game5Method();
				break;
			case 6:
				game6.Game6Method();
				break;
			case 7:
				System.out.println("                     Thank you for playing.");
				choiceNumber = 8;
				break;
				default:
				System.out.println("         Invalid choice.  The game is over.");
				choiceNumber = 8;
				break;
			}//switch

		}//while
	}
	
	private void printMenuChoices()
	{
		System.out.println(""+
		 "                       1) Throw a particular dice number a certain number of times in a row. \n"
		+ "                       2) Build a chart displaying the randomness of the 6 dice numbers. \n"
		+ "                       3) Throw a given pattern of six dice. \n"
		+ "                       4) Find the percent difference for each dice number \n"
        + "			                 from the average, given a certain number of throws.\n"
		+ "                       5) Guess the number between 1 and 100. \n"
		+ "                       6) Guess a five digit number. \n"
		+ "                       7) Quit. \n"
		+ "                      Please choose one of the choices.");

	}
	private static int readChoiceNumber()
	{
		Scanner scan = new Scanner(System.in);
		int choiceNumber;
		String indent = "                   ";
		choiceNumber = scan.nextInt();
		while(choiceNumber < 1 || choiceNumber > 8)
		{
			System.out.println(indent + "the number must be 1 through 7 inclusive");
			System.out.println(indent + "    please enter a proper choice.  ");
			choiceNumber = scan.nextInt();
		}
		return choiceNumber;
	}
}