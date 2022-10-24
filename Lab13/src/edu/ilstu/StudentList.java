package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * A class to maintain an array of students
 */
public class StudentList
{
	// add appropriate instance variables here: need an array of Students
	// and a way to keep track of how many students are in the list
	// assume there will never be more than 100 students
	// call your array stuArray

	private Student[] stuArray;
	private int numStudents;

	// provide a default constructor that sets up an empty student array

	public StudentList()
	{
		this.stuArray = new Student[100];
		numStudents = 0;
	}

	// provide a private helper method that accepts a Student's name and
	// returns the index of the student in the array or -1 if the student
	// is not in the array. This method should be called by the
	// displayStudent method

	private int studentIndex(String name)
	{
		int index = 0;

		System.out.println(name);
		for (int i = 0; i < numStudents; i++)
		{

			if (stuArray[i].getName().equalsIgnoreCase(name))
			{
				index = i;

				return index;
			} else
				index = -1;

		}

		System.out.println(index);
		return index;
	}

	/**
	 * Reads a list of students from a file
	 * 
	 * @param fileName Name of the file to read from
	 */
	public void readList(String fileName)
	{
		// fill in code to read a list of students from a file
		// into the array -- this should end with StudentList
		// consisting of exactly those students in the file--so
		// the first student in the file will be the first student
		// in the array, and all operations on the list will only
		// affect the set of students in the file until additional
		// students are added using the addStudent method below.
		// Make sure you don't overfill the array.
		// For each student, create the Student object using the default
		// constructor and then use the read method of Student to get
		// the data from the file

		Scanner File1 = null;

		try
		{
			File1 = new Scanner(new File(fileName));

			while (File1.hasNext())
			{
				Student stu1 = new Student();
				if (numStudents < stuArray.length)
				{
					stu1.read(File1);
					stuArray[numStudents] = stu1;
					System.out.println(stuArray[numStudents].toString());
					numStudents++;
					System.out.println(numStudents);
				}

			}

		} catch (FileNotFoundException e)
		{
			System.out.println("No file found");
		} finally
		{
			File1.close();
		}

	}

	/**
	 * Writes a list of students to a file
	 * 
	 * @param fileName Name of the file to write to
	 */
	public void writeList(String fileName)
	{
		PrintWriter outfile = null;
		try
		{
			outfile = new PrintWriter(new FileWriter("studentout.txt"));
			for (int i = 0; i < numStudents; i++)
			{
				stuArray[i].write(outfile);
			}
			// use a for loop to write all of the Student objects from
			// the array to output.txt by calling the Student's write
			// method and passing it outfile

			outfile.close();
		} catch (IOException e)
		{
			System.out.println("An error occurred: " + e);
			System.out.println("The list of students was not written");
		}
	}

	/**
	 * Add a student to the end of the list
	 * 
	 * @param aStudent The student to add
	 */
	public void addStudent(Student aStudent)
	{
		// write code to add a student to the end of the list of students only if there
		// is room
		if (numStudents < stuArray.length)
		{
			stuArray[numStudents] = aStudent;
			numStudents++;
		} else
		{
			System.out.println("Array is full. No more students can be added...");
		}
	}

	/**
	 * @param studentName
	 */
	public void displayStudent(String studentName)
	{
		// fill in missing pieces of the following code and uncomment it
		// add appropriate code to handle an incorrect name

		int stu = studentIndex(studentName);

		if (stu == -1)
		{
			System.out.println("No student found");
		} else
			System.out.println(stuArray[stu]);
	}

	// Write a method to count the number of freshmen, sophomores, juniors and
	// seniors in the array
	// and print the counts to the screen. The Student class has a getClassLevel
	// method that
	// returns a String with the value "Freshman", "Sophomore", "Junior" or
	// "Senior". Use an array
	// to store your counts.
	// add an appropriate javadoc comment

	public void printClassCounts()
	{
		int freshmanCount = 0;
		int sophmoreCount = 0;
		int juniorCount = 0;
		int seniorCount = 0;

		for (int i = 0; i < numStudents; i++)
		{
			if (stuArray[i].getClassLevel().equalsIgnoreCase("Freshman"))
			{
				freshmanCount++;
			}
			if (stuArray[i].getClassLevel().equalsIgnoreCase("Sophomore"))
			{
				sophmoreCount++;
			}
			if (stuArray[i].getClassLevel().equalsIgnoreCase("Junior"))
			{
				juniorCount++;
			}
			if (stuArray[i].getClassLevel().equalsIgnoreCase("Senior"))
			{
				seniorCount++;
			}
		}
		System.out.println("The freshman count is: " + freshmanCount + "\n" + "The sophmore count is: " + sophmoreCount
				+ "\n" + "The junior count is: " + juniorCount + "\n" + "The senior count is: " + seniorCount);

	}

}
