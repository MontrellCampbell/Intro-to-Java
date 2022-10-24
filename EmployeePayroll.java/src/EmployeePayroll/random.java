package EmployeePayroll;

import java.util.Scanner;

public class random
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = keyboard.next();

		if (name.equals("IT"))
			System.out.println("School of IT");
		else if (name.equals("Bus"))
			System.out.println("School of business");

		switch (name)
		{
		case "IT":
			System.out.println("school of IT");
			break;
		case "Bus":
		{
			System.out.println("school of business");
			break;
		}

		}

	}
}
