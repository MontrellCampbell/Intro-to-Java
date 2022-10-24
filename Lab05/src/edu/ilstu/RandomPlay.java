package edu.ilstu;

import java.util.Random;

public class RandomPlay
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Random random = new Random();
		int low = 1;
		int max = 200;
		int result = random.nextInt(max - low) + low;

		Random random2 = new Random();
		int low2 = 1;
		int max2 = 200;
		int result2 = random.nextInt(max2 - low2) + low2;

		System.out.println("Your first random number is " + result);
		if (result % 2 == 0)
			System.out.println(result + " is an even number");
		else
			System.out.println(result + " is an odd number");

		if (result > 100)
			System.out.println(result + " is a large number");
		else
			System.out.println(result + " is a small number");

		System.out.println("Your second random numner is " + result2);
		if (result2 > result)
			System.out.println("the second random number " + result2 + " is greater than " + result);
		else if (result > result2)
			System.out.println("the first random number " + result + " is greater than " + result2);
		else
			System.out
					.println("the second random number " + result2 + " is equal to the first random number " + result);

	}

}
