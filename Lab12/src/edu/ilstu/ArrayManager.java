package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * <insert class description here>
 * 
 * Montrell Campbell mcamp10 & Zack Boehm zcboeh1
 *
 */
public class ArrayManager
{
	int[] intArr;
	int arrCount;

	public ArrayManager()
	{
		intArr = new int[100];
		arrCount = 0;
	}

	public void fillArray()
	{
		int curVal;

		Scanner input = null;
		try
		{
			input = new Scanner(new File("data.txt"));
			// set the current number of items in the array to zero
			while (input.hasNextInt())
			{
				curVal = input.nextInt();
				intArr[arrCount] = curVal;
				arrCount++;
			}
			input.close();
		} catch (FileNotFoundException e)
		{
			System.out.println("Could not find data.txt file");
			System.exit(1);
		}
	}

	public int smallestValue()
	{
		int smallest = 100;

		for (int i = 0; i < intArr.length; i++)
		{
			if (intArr[i] < smallest)
			{
				smallest = intArr[i];
			}

		}

		return smallest;
	}

	public int largestValue()
	{
		int largest = 0;

		for (int i = 0; i < arrCount; i++)
		{
			if (intArr[i] > largest)
			{
				largest = intArr[i];
			}
		}

		return largest;
	}

	public int firstInstanceVar(int val)
	{
		int index = -1;

		for (int i = 0; i < arrCount; i++)
		{

			if (intArr[i] == val)
			{
				index = i;
				break;
			}

		}
		return index;

	}

}
