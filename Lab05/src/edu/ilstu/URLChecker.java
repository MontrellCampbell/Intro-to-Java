/*
 * Created on: %{date}
 *
 * ULID: mcamp10
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author Montrell Campbell and zcboeh1 Zack Boehm
 *
 */
public class URLChecker
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter website URL: ");
		String userinput = keyboard.nextLine();
		String substr = userinput.substring(userinput.length() - 3);
		System.out.print(substr);

		if (substr.equals("gov"))
			System.out.println("this is a gov website");
		else if (substr.equals("com"))
			System.out.print("this is a com website");
		else if (substr.equals("edu"))
			System.out.println("this is a edu website");
		else if (substr.equals("org"))
			System.out.println("this is a org website");
		else
			System.out.print("this web adress is from another entity");

	}

}
