import java.util.Scanner;
import java.util.Random;
public class DiceInARow
{
	Scanner scan = new  Scanner(System.in);

	public void DiceInARowMethod() throws InterruptedException
	{
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		int n=7;
		int choiceNumber = 0;
		int rowNumber = 0;
		int patternCount=0;
		int attempts = 0;
		String answer;




		System.out.println(" This game throws a dice until a particular dice face number \n"
				+" appears in a row a certain number of times.");

		do{

			System.out.println("Please enter the dice face number 1 - 6.");
			choiceNumber = scan.nextInt();
			if (choiceNumber<1 || choiceNumber>6)
			{
				System.out.println("The number you entered is not between 1 and 6. Please try again.");
				choiceNumber = scan.nextInt();
			} 



			System.out.println("Please enter the number of times that you would like " + choiceNumber + " to appear in a row.");
			rowNumber = scan.nextInt();

			
			do
			{
				int diceFaceNumber = generator.nextInt(n);
				if (choiceNumber==diceFaceNumber)
				{
					patternCount++;
					attempts++;
				}
				else
				{
					patternCount=0;
					attempts++;
				}

			}while (patternCount<=rowNumber);

			System.out.println("It took " + attempts + " throws to get the number " + choiceNumber + " to appear " + rowNumber + " in a row.");

			System.out.println("Do you want to run this program again? yes/no:");
			answer = scan.next();
		}while (answer.equalsIgnoreCase("yes"));
	}

	
}