package edu.ilstu;

import java.util.Scanner;

public class OddIntegers
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = keyboard.nextInt();
		int i = 1;
		int sum = 1;

		System.out.print(i);

		while (1 < n)
		{

			i += 2;

			System.out.print(" + " + i);
			sum += i;
			n--;

		}

		System.out.println(" = " + sum);
	}

}
