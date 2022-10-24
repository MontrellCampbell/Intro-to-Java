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
 * @author Montrell Campbell & Zack Boehm zcboeh1
 *
 */
public class HighTemps
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int[] tempArr = new int[151];
		int temp, i;

		while (true)
		{
			System.out.print("Enter a temperature high: (-999 to exit)");
			temp = input.nextInt();
			if (temp == -999)
				break;
			if (temp >= -40 && temp <= 110)
			{
				tempArr[temp + 40]++;
			} else
				System.out.println("Enter a temperature high within -40 to 110...");
		}

		System.out.println("Temparature\t\tNumber of Days");
		System.out.println("-------------------------------");

		for (i = 0; i < tempArr.length; i++)
		{
			if (tempArr[i] > 0)
				System.out.println(i - 40 + "\t\t" + tempArr[i]);
		}

	}

}
