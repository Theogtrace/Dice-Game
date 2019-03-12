import java.util.Random;
import java.util.Scanner;

public class Game3
{

	private int d1,d2,d3,d4,d5,d6;
	private int t1,t2,t3,t4,t5,t6;
	private int tossCount;

	public Scanner in=new Scanner(System.in);
	public void Game3Method() throws InterruptedException
	{
		input(); 
		process(); 
		output();
	}

	private void input()
	{
		System.out.println("Please enter a series of 6 dice that you would like the computer to duplicate");

		d1=validNum();
		d2=validNum();
		d3=validNum();
		d4=validNum();
		d5=validNum();
		d6=validNum();
	}

	private int validNum()
	{
		int n;
		while (true){
			n=in.nextInt();
			if(n>=1 && n<=6)
				return n;
			else
				System.out.println("invalid number entered. Please enter number between 1 and 6.");
		}
	}

	private void process(){
		tossCount=0;

		while(true){
			tossCount++;
			Toss();
			if(match())
				break;
		}
	}

	private void output() throws InterruptedException{
		System.out.printf("It took %d throws to get the pattern %d %d %d %d %d %d to appear",tossCount,d1,d2,d3,d4,d5,d6);
		System.out.println("Would you like to play the game again?");
		System.out.println("Please enter (yes/no) ");
		Scanner in=new Scanner(System.in);
		String choice = in.next();

		if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"))
			Game3Method();

	} private void Toss()
	{
		Random rand=new Random();

		t1=rand.nextInt(6)+1;
		t2=rand.nextInt(6)+1;
		t3=rand.nextInt(6)+1;
		t4=rand.nextInt(6)+1;
		t5=rand.nextInt(6)+1;
		t6=rand.nextInt(6)+1;
	}

	private boolean match()
	{
		
		if(d1!=t1)      return false;
		if(d2!=t2)      return false;
		if(d3!=t3)      return false;
		if(d4!=t4)      return false;
		if(d5!=t5)      return false;
		if(d6!=t6)      return false;

		return true;
	}
}