package edu.ilstu;

import java.util.Scanner;

public class TimeCalculator
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of seconds");
		int input1 = input.nextInt();
		int Hours = input1 / 3600;
		int Minutes = (input1 % 3600) / 60;
		int Seconds = input1 % 60;

		System.out.println("Hours: " + Hours + "\n" + "Minutes: " + Minutes + "\n" + "Seconds: " + Seconds);
	}

}
