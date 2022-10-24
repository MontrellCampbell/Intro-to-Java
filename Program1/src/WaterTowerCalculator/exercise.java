package WaterTowerCalculator;

import java.util.Random;
import java.util.Scanner;

public class exercise
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int guess = keyboard.nextInt();
		Random random = new Random();
		int min = 1;
		int max = 10;
		int result = random.nextInt(max-min)+min;
		
		if (guess < 1 || guess > 10)
		{
			System.out.print("Invalid");
		}
		else {
			
			if  (guess == result)
				System.out.print("congratulations");
		}
		else {
			
			if 
			
			
		}
		
		
	}
}