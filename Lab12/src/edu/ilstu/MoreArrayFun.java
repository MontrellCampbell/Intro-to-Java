package edu.ilstu;

import java.util.Scanner;

public class MoreArrayFun
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayManager arr1 = new ArrayManager();
		arr1.fillArray();
		System.out.println("The smallest value in the array is " + arr1.smallestValue());
		System.out.println("The largest value in the array is " + arr1.largestValue());
		System.out.println(arr1.firstInstanceVar(-10));

		int input = 0;

		while (input != -999)
		{
			System.out.println("Enter a value > ");
			input = scan.nextInt();
			if (input == -999)
			{
				break;
			}

			if (arr1.firstInstanceVar(input) != -1)
			{
				System.out.println(" The index of " + input + " is " + arr1.firstInstanceVar(input));
			}
			if (arr1.firstInstanceVar(input) == -1)
			{
				System.out.println("Not found");
			}
		}

	}

}
