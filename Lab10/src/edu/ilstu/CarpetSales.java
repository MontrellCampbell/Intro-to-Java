package edu.ilstu;

import java.util.Scanner;

/**
 * Calculates the total price for the flooring of a room
 *
 * @author Montrell Campbell & zcboeh1 Zack Boehm
 *
 */

public class CarpetSales
{

	public static void main(String[] args)

	{

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Length: ");
		int length = input.nextInt();
		System.out.print("Enter the Width: ");
		int width = input.nextInt();
		RoomDimension rd1 = new RoomDimension(length, width);

		System.out.print("Enter the cost per square foot: ");
		double CPSQ = input.nextDouble();
		RoomCarpet rc1 = new RoomCarpet(CPSQ, rd1);

		System.out.println((rc1.getTotalCost()));

	}

}
