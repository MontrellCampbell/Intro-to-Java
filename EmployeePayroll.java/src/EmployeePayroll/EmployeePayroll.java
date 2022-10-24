package EmployeePayroll;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EmployeePayroll
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("$#0.00");

		System.out.print("Please enter the first employee's first name: ");
		String firstname = keyboard.nextLine();
		System.out.print("Please enter the employee's last name: ");
		String lastname = keyboard.nextLine();
		System.out.print("Please enter the number of hours worked: ");
		int hoursworked = keyboard.nextInt();
		EmployeePayroll1 emp1 = new EmployeePayroll1(firstname.toUpperCase(), lastname.toUpperCase(), hoursworked);

		System.out.println();

		System.out.print("Please enter the employee's first name: ");
		String firstname2 = keyboard.next();
		System.out.print("Please enter the employee's last name: ");
		String lastname2 = keyboard.next();
		System.out.print("Please enter the number of hours worked: ");
		int hoursworked2 = keyboard.nextInt();
		EmployeePayroll1 emp2 = new EmployeePayroll1(firstname2.toUpperCase(), lastname2.toUpperCase(), hoursworked2);

		System.out.println();

		System.out.print("Please enter the employee's first name: ");
		String firstname3 = keyboard.next();
		System.out.print("Please enter the employee's last name: ");
		String lastname3 = keyboard.next();
		System.out.print("Please enter the number of hours worked: ");
		int hoursworked3 = keyboard.nextInt();
		EmployeePayroll1 emp3 = new EmployeePayroll1(firstname3.toUpperCase(), lastname3.toUpperCase(), hoursworked3);

		System.out.println();

		System.out.println("Programmer's Book Store Payroll Report");

		System.out.println();

		System.out.print("Emp#    " + "  Name           ");
		System.out.println("Hours " + " Reg Pay   " + " OT Pay   " + " Inc Tax   " + " Net Pay");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.print(emp1.getEmployee_num() + "    " + emp1.getFirstName() + "   " + emp1.getLastName());
		System.out.println("    " + emp1.hoursworked + "    " + formatter.format(emp1.getRegularPay()) + "    "
				+ formatter.format(emp1.getOTPay()) + "    " + formatter.format(emp1.getIncomeTax()) + "    "
				+ formatter.format(emp1.getNetPay()));

		System.out.print(emp2.getEmployee_num() + "     " + emp2.getFirstName() + "   " + emp2.getLastName());
		System.out.println("    " + emp2.hoursworked + "    " + formatter.format(emp2.getRegularPay()) + "    "
				+ formatter.format(emp2.getOTPay()) + "    " + formatter.format(emp2.getIncomeTax()) + "    "
				+ formatter.format(emp2.getNetPay()));

		System.out.print(emp3.getEmployee_num() + "   " + emp3.getFirstName() + "   " + emp3.getLastName());
		System.out.println("    " + emp3.hoursworked + "    " + formatter.format(emp3.getRegularPay()) + "    "
				+ formatter.format(emp3.getOTPay()) + "    " + formatter.format(emp3.getIncomeTax()) + "    "
				+ formatter.format(emp3.getNetPay()));

		System.out.println();

		System.out.println("Total Regular Pay: "
				+ formatter.format(emp1.getRegularPay() + emp2.getRegularPay() + emp3.getRegularPay()));
		System.out.println(
				"Total Overtime Pay: " + formatter.format(emp1.getOTPay() + emp2.getOTPay() + emp3.getOTPay()));
		System.out.println("Total Income Taxes : "
				+ formatter.format(emp1.getIncomeTax() + emp2.getIncomeTax() + emp3.getIncomeTax()));
		System.out
				.println("Total Net Pay: " + formatter.format(emp1.getNetPay() + emp2.getNetPay() + emp3.getNetPay()));

	}

}
