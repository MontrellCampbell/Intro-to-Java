package EmployeePayroll;

import java.util.Random;

public class EmployeePayroll1
{

	private String firstname;
	private String lastname;
	public int hoursworked;
	double OTPay = 0;
	double RegularPay = hoursworked * 15;

	public EmployeePayroll1(String fname, String lname, int hours)
	{
		this.firstname = fname;
		this.lastname = lname;
		this.hoursworked = hours;

	}

	public String getFirstName()
	{
		return firstname;
	}

	public String getLastName()
	{
		return lastname;
	}

	public double getRegularPay()

	{
		double RegularPay = hoursworked * 15;
		if (hoursworked > 40)
		{
			RegularPay = 40 * 15;
		}

		return RegularPay;

	}

	public String getEmployee_num()

	{
		Random random = new Random();
		int min = 1;
		int max = 5000;
		int result = random.nextInt(max - min) + min;
		String FirstInitial = firstname.substring(0, 1).toUpperCase();
		String SecondInitial = lastname.substring(0, 1).toUpperCase();
		return FirstInitial + SecondInitial + result;

	}

	public double getOTPay()

	{

		OTPay = 0;

		if (hoursworked > 40)
		{
			RegularPay = 40 * 15;
			OTPay = (hoursworked - 40) * (1.5 * 15);
		}

		else
		{
			RegularPay = hoursworked * 15;
		}

		return OTPay;
	}

	public double getIncomeTax()

	{

		double IncomeTax = 0.035 * (RegularPay + OTPay);
		if (OTPay == 0)
		{
			IncomeTax = 0.035 * RegularPay;
		}
		return IncomeTax;
	}

	public double getNetPay()

	{
		double IncomeTax = 0.035 * (RegularPay + OTPay);
		double NetPay = OTPay + RegularPay - IncomeTax;
		if (OTPay == 0)

		{
			NetPay = RegularPay - IncomeTax;
		}
		return NetPay;
	}

	@Override
	public String toString()
	{
		return this.firstname + " " + this.lastname + " " + this.hoursworked;

	}

}
