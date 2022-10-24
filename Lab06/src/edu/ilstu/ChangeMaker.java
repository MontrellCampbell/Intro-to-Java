package edu.ilstu;

import java.util.Scanner;

public class ChangeMaker
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Item price: ");
		int ItemPrice = keyboard.nextInt();
		int change1 = 100 - ItemPrice;
		int change = 100 - ItemPrice;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;

		if (ItemPrice < 25)
		{
			System.out.println("Item price must be 25 cents to a dollar");
		} else if (ItemPrice > 100)
		{
			System.out.println("Item price must be 25 cents to a dollar");
		} else if (ItemPrice % 5 != 0)
		{
			System.out.print("Item price must be in increments of 5 cents");
		}

		while (change > 0 && ItemPrice >= 25 && ItemPrice <= 100)
		{

			if (change == 50)

			{
				quarter += 2;
				change -= 50;

			}

			if (change == 75)

			{
				quarter += 3;
				change -= 75;
			}

			if (change >= 25)

			{
				quarter++;
				change -= 25;
			}

			if (change >= 10)
			{
				dime++;
				change -= 10;

				if (change >= nickel)
				{
					nickel++;
					change -= 5;
				}

			}

		}
		if (change == 0)

		{
			System.out.println("You bought and item for" + ItemPrice
					+ "cents and you gave me a dollar. Your change is: " + change1 + " cents");
		}

		if (quarter == 1)
		{
			System.out.println(quarter + " Quarter");
		} else if (quarter > 1)
		{
			System.out.println(quarter + " Quarters");
		}
		if (dime == 1)
		{
			System.out.println(dime + " Dime");
		} else if (dime > 1)
		{
			System.out.println(dime + " Dimes");
		}
		if (nickel == 1)
		{
			System.out.println(dime + " Nickel");
		} else if (nickel > 1)
		{
			System.out.println(nickel + " Nickels");
		}

		if (ItemPrice == 100)
		{
			System.out.println("0");
		}

	}
}
