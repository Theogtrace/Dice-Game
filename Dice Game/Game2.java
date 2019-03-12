
import java.util.Scanner;
public class Game2
{
	int DICE_FACE_COUNT = 6;
	Scanner keyboard = new Scanner (System.in);
	int numberOfTimes;
	int [] diceValues = new int[DICE_FACE_COUNT];
	public void Game2Method()
	{
		input();
		process();
		output();
	}

	public void input()
	{
		for (int i = 0; i < diceValues.length; i++)
		{
			diceValues[i] = 0;
		}
		System.out.println("This game prompts the user for a number of die throws.");
		System.out.println("The game then displays a chart indicating the number");
		System.out.println("of times the die landed with that face number on top.");
		System.out.println("Please enter the number of times");
		System.out.print("you would like to throw the die: ");
		numberOfTimes = keyboard.nextInt();
	}
	public void process()
	{
		System.out.println("The chart showing " + numberOfTimes + " throws of the die:");
		while(numberOfTimes > 0)
		{
			int number = (int)(DICE_FACE_COUNT * Math.random()); 
			diceValues[number]++;
			numberOfTimes--;
		}
	}
	public void output()
	{
		for (int i = 0; i < diceValues.length; i++)
		{
			System.out.print(i + 1 + " ");
			for (int astr = 0; astr < diceValues[i]; astr++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Would you like to play the game again?");
		System.out.println("Please enter (yes/no) ");
		keyboard = new Scanner(System.in);
		String choice = keyboard.next();
		if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"))
			Game2Method();
	}
}