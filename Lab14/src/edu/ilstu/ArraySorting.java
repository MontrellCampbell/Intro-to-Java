package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Program that works with arrays of integers including sorting and merging
 * sorted arrays
 * 
 * @author Montrell Campbell
 *
 */
public class ArraySorting
{
	// reads a file and adds those contents into the elements of the array

	public static int readArray(int[] theArray, String inputFileName)
	{
		// read the contents of the specified file into theArray and return the number
		// of elements read
		// you may assume that the array will be big enough
		// you must handle relevant exceptions

		File file1 = new File(inputFileName);
		int elements = 0;
		int num;

		try
		{
			Scanner input = new Scanner(file1);

			while (input.hasNext())
			{
				num = input.nextInt();
				theArray[elements] = num;
				elements++;

				if (input.hasNext())
				{
					input.nextLine();
				}
			}

			input.close();
		} catch (FileNotFoundException e)
		{
			System.out.println("No file found");
		}

		return elements;

	}

	// reads each element of the array and adds it to the created file
	public static void writeArray(int[] theArray, int numValues, String outputFileName)
	{
		// write the first numValues elements of theArray to the specified file
		// you must handle relevant exceptions

		FileWriter fw;

		theArray = new int[numValues];

		try
		{
			fw = new FileWriter(outputFileName, false);
			PrintWriter pw = new PrintWriter(fw);

			for (int i = 0; i < numValues; i++)
			{
				pw.print(theArray[i]);
			}

		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// takes an array and sorts the elements from smallest to large
	public static void selectionSort(int[] theArray, int numValues)
	{
		// sort the first numValue elements of theArray using the selection sort
		// algorithm

		theArray = new int[numValues];

		for (int i = 0; i < theArray.length - 1; i++)
		{
			int min = i;

			for (int j = i + 1; j < theArray.length; j++)
			{
				if (theArray[min] > theArray[j])
				{
					min = j;
				}
			}

			int temp = theArray[i];
			theArray[i] = theArray[min];
			theArray[min] = temp;

		}

	}

	// takes two arrays and combines them into one merged array
	public static int mergeArrays(int[] arr1, int size1, int[] arr2, int size2, int[] mergedArr)
	{
		// implement the merge algorithm from prelab

		arr1 = new int[size1];
		arr2 = new int[size2];

		mergedArr = new int[arr1.length + arr2.length];

		int index = arr1.length;

		for (int i = 0; i < arr1.length; i++)
		{
			mergedArr[i] = arr1[i];
		}

		for (int j = 0; j < arr2.length; j++)
		{
			mergedArr[index] = arr2[j];
			index++;
		}

		return mergedArr.length;
	}

	public static void main(String[] args)
	{
		// Test just the reading and writing -- check contents of numbersout.txt
		int[] array1 = new int[100];
		int numElems1 = readArray(array1, "numbers.txt");
		writeArray(array1, numElems1, "numbersout.txt");

		// Test the sorting -- check contents of sortedout.txt
		selectionSort(array1, numElems1);
		writeArray(array1, numElems1, "sortedout.txt");

		// Read second array and test merging -- check contents of mergedout.txt
		int[] array2 = new int[100];
		int numElems2 = readArray(array2, "numbers2.txt");
		int[] array3 = new int[200];
		int numElems3 = mergeArrays(array1, numElems1, array2, numElems2, array3);
		writeArray(array3, numElems3, "mergedout.txt");

	}

}
