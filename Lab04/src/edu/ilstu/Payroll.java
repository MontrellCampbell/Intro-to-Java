/*
 * Created on: %{date}
 *
 * ULID: mcamp10
 * Class: IT 168 
 */
package edu.ilstu;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This program is to calculate payroll of employees
 *
 * @author Montrell Campbell and zcboeh1 Zack Boehm
 *
 */
public class Payroll
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);
		Employee emp1 = new Employee("Smith", "John", 15);

		System.out.print("Enter first name: ");
		String firstname = keyboard.next();

		System.out.print("Enter last name: ");
		String lastname = keyboard.next();

		System.out.print("Enter the pay rate: ");
		double payrate = keyboard.nextDouble();
		Employee emp2 = new Employee(lastname, firstname, payrate);

		System.out.println();

		emp1.print();

		System.out.println();

		emp2.print();

		String pattern = "$.00";
		DecimalFormat decimalformat = new DecimalFormat(pattern);

		System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " received "
				+ decimalformat.format(emp1.calculatePay(42)));
		System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " received "
				+ decimalformat.format(emp2.calculatePay(40)));

		System.out.println();

		System.out.print("Enter the raise amount for employee 1: ");
		double raise1 = keyboard.nextDouble();
		emp1.giveRaise(raise1);
		System.out.print("Enter the raise amount for employee 2: ");
		double raise2 = keyboard.nextDouble();
		emp2.giveRaise(raise2);

		System.out.println();

		emp1.printPayrollLine(42);
		emp2.printPayrollLine(40);

		System.out.println();

		emp1.print();

		System.out.println();

		emp2.print();

	}

}
