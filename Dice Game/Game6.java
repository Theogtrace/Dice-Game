import java.util.Scanner;
public class Game6 
{
	public void Game6Method() throws InterruptedException
	{
		System.out.println("Using the random number generator, this game creates a");
		System.out.println("five-digit number. The player guesses the number.");
		System.out.println("The computer returns two numbers, the first is the number");
		System.out.println("of digits that are in the proper position and the second");
		System.out.println("is the sum of the correct digits guessed so far.");
		System.out.println("The player continues guessing until she guesses the correct number");
		Scanner keyboard = new Scanner(System.in);
		boolean playAgain = true; 

		while (playAgain)
		{
			String secret = String.valueOf((int)(Math.random() * 90000) + 10000);
			String answer = keyboard.next();
			int guesses = 1;
			while (!answer.equals(secret)) {
				int count = 0;
				int sum = 0;
				for (int i = 0; i < 5; i++) {
					if (answer.charAt(i) == secret.charAt(i)) {
						count++;
						sum += Integer.parseInt(answer.substring(i, i + 1));
					}
				}
				System.out.println("You have found " + count + " digits so far with a sum of " + sum + ". ");
				guesses++;
				answer = keyboard.next();
			}
			System.out.println("It took " + guesses + " guesses to get the number");

			System.out.println("Would you like to play the game again?");
			System.out.print("Please enter (yes/no) ");
			if(keyboard.next().equals("no")) { 

				playAgain = false; 
			}
		}
	}
}
