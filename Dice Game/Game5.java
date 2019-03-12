import java.util.Scanner;
public class Game5 
{
	public void Game5Method() throws InterruptedException
	{
		Scanner keyboard = new Scanner(System.in);
		int guess;
		int secret;
		int count;
		boolean playAgain = true; 
		{
			while (playAgain)
			{
				System.out.println("This program allows you to guess a random integer");
				System.out.println("between 1 and 100 inclusive. The computer creates");
				System.out.println("a random number and tells you if your guess was");
				System.out.println("correct, hi or low. ");

				secret = (int)(Math.random() * 100) + 1;

				System.out.print("\nPlease guess the number ");
				guess = keyboard.nextInt();
				count = 1;

				while (guess != secret) {
					System.out.print("You were "
							+ (guess > secret ? "high" : "low")
							+ ", please guess again ");
					guess = keyboard.nextInt();
					count++;
				}
				System.out.println("Good job! You got the number with " + count + " tries.");

				System.out.println("\nWould you like to play the game again?");
				System.out.print("Please enter (yes/no) ");
				if(keyboard.next().equals("no")) { 

					playAgain = false; 
				}
			}
		}
	}
}

