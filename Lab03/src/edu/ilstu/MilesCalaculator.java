package edu.ilstu;

import java.util.Scanner;

public class MilesCalaculator
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		double miles = 0;
		double gallons = 0;

		Scanner Userinput = new Scanner(System.in);
		System.out.println("Number of miles Traveled");
		miles = Userinput.nextInt();
		System.out.println("Number of gallons used");
		gallons = Userinput.nextInt();
		double milespergallon = miles / gallons;
		System.out.println("You use " + milespergallon + " gallons per mile");
	}

}
