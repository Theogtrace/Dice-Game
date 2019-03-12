import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

public class Game4
{
	public void Game4Method() throws InterruptedException
	{
		boolean playAgain = true; 

		Scanner in = new Scanner(System.in); 

		while(playAgain) { 

			System.out.print("How many dice throws would you like? "); 

			int rolls = in.nextInt(); 

			Random rand = new Random(); 

			int side[] = new int[6]; 

			for(int i = 0; i < rolls; ++i) { 

				side[rand.nextInt(6)]++; 

			} 

			DecimalFormat d = new DecimalFormat("0.0"); 

			System.out.println("The number of throws is " + rolls + " with the average of " + d.format(rolls/6.0) + "."); 

			System.out.println("The percentage from the average for each dice number is:"); 

			for(int i = 0; i < side.length; ++i) { 

				System.out.print("Dice number " + (i+1) + " landed " + side[i] 

						+ " times and is " + d.format(100 * Math.abs((side[i]/(rolls/6.0)) - 1)) + "%"); 

				if(side[i] >= (rolls/6.0)) { 

					System.out.println(" above the average."); 

				} 

				else { 

					System.out.println(" below the average."); 

				} 

			} 

			System.out.println("Would you like to play the game again?"); 

			System.out.print("Please enter (yes/no) "); 

			if(in.next().equals("no")) { 

				playAgain = false; 

			} 

		} 

	} 

}