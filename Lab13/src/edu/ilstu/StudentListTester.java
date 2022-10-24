/*
 * Created on: %{date}
 *
 * ULID: mcamp10
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * <insert class description here>
 *
 * @author Montrell Campbell
 *
 */
public class StudentListTester
{
	StudentList SL;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		StudentList stud1 = new StudentList();

		stud1.readList("students.txt");
		stud1.displayStudent("Miles Kimball");
		stud1.printClassCounts();
		Student stud2 = new Student("john smith", "Math", 4.0, 39);
		stud1.addStudent(stud2);
		stud1.displayStudent("john smith");
		stud1.writeList("studentout.txt");

	}

}
