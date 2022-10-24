package edu.ilstu;

public class Experiments
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		short aShort = 6;
		long aLong = 105;
		int int1 = 10;
		int int2 = 11;
		float aFloat = 1.0f;
		double aDouble = 100.3;

		// Short can be assigned to: Long, int,
		// Long can be assigned to: Short, int,
		// Int can be assinged to: Double, Long, Short
		// Float can be assigned to: Int, double, long, short
		// Double can be assigned to: Int, float, long, short

		aDouble = int2 / 2;
		System.out.println("aDouble = int2 / 2 result in " + aDouble);
		aDouble = int2 / 2.0;
		System.out.println("aDouble = int2 / 2.0 results in" + aDouble);
		aLong = int1 % 2;
		System.out.println("aLong = int1 % 2 results in" + aLong);
		aLong = int1 % 4;
		System.out.println("aLong = int1 % 4 results in " + aLong);
		int1 = int2 % 2;
		System.out.println("int1 = int2 % 2 results in" + int1);
		int1 = int2 % 3;
		System.out.println("int1 = int2 % 3 results in" + int1);
		int1 = int2 % 4;
		System.out.println("int1 = int2 % 4 results in" + int1);
		int1 = 2 + 3 * 4;
		System.out.println("int1 = 2 + 3 * 4 results in" + int1);
		int1 = (2 + 3) * 4;
		System.out.println("int1 = (2 + 3) * 4 results in" + int1);

	}

}
