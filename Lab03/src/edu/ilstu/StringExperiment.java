package edu.ilstu;

import java.util.Scanner;

public class StringExperiment
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner Userinput = new Scanner(System.in);

		String firstName;
		String middleName;
		String lastName;

		firstName = "Montrell";
		middleName = "None";
		lastName = "Campbell";

		System.out.println(firstName + " " + middleName + " " + lastName);
		System.out.println(firstName + " " + middleName.charAt(0) + " " + lastName);
		System.out.println(firstName.toUpperCase() + " " + middleName + " " + lastName.toLowerCase());
		System.out.println(lastName.length());
		System.out.println(lastName.charAt(3));
		System.out.println(firstName.charAt(7));

	}

}
