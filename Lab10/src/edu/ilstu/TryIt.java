/*
 * 03/22/22
 *
 * ULID: mcamp10
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * 1.Should you use == or the String method equals to determine if two string
 * are the same? Answer: Using the == will works some of the time but the equals
 * method is better practice and more reliable to use for comparing two string.
 * 
 * 2.If you pass an object as a parameter, and you change the values of one of
 * the instance variables in the method it was passed to, is the value still
 * changed back in the calling method? Answer: Yes, the value of the parameter
 * passed will change if the values of method it was passed through change
 * 
 * 3. If you pass a primitive variable, and you change the value of the
 * primitive in the method it was passed to, is the value changed back in the
 * calling method? Answer: No, the value in the calling method will remain the
 * same.
 * 
 *
 * @author Montrell Campbell & zcboeh1 Zack Boehm
 *
 */
public class TryIt
{

	public static void main(String[] args)
	{

		String varName = "string literal";
		String varName2 = "string literal";
		String varName3 = "String literal";

		System.out.println("Testing == with objects created using = \"string literal\" that have the same contents");

		System.out.println("Expected: False");
		System.out.print("Actual: ");
		System.out.println(varName == varName2);

		System.out
				.println("Testing == with objects created using = \"string literal\" that have the different contents");

		System.out.println("Expected: False");
		System.out.print("Actual: ");
		System.out.println(varName == varName3);

		System.out.println(
				"Testing equals() with objects created using = \"string literal\" that have the same contents");
		System.out.println("Expected: True");
		System.out.print("Actual: ");
		System.out.println(varName.equals(varName2));

		System.out.println(
				"Testing equals() with objects created using = \"string literal\" that have the different contents");
		System.out.println("Expected: True");
		System.out.print("Actual: ");
		System.out.println(varName.equals(varName3));

		System.out.println("");

		String varName4 = new String("phrase");
		String varName5 = new String("phrase");
		String varName6 = new String("Phrase");

		System.out.println("Testing == with objects created using = \"string literal\" that have the same contents");

		System.out.println("Expected: False");
		System.out.print("Actual: ");
		System.out.println(varName4 == varName5);

		System.out
				.println("Testing == with objects created using = \"string literal\" that have the different contents");

		System.out.println("Expected: False");
		System.out.print("Actual: ");
		System.out.println(varName4 == varName6);

		System.out.println(
				"Testing equals() with objects created using = \"string literal\" that have the same contents");
		System.out.println("Expected: False");
		System.out.print("Actual: ");
		System.out.println(varName4.equals(varName5));

		System.out.println(
				"Testing equals() with objects created using = \"string literal\" that have the different contents");
		System.out.println("Expected: False");
		System.out.print("Actual: ");
		System.out.println(varName4.equals(varName6));

		testTempVars();

	}

	private static void testTempVars()
	{
		BankAccount myAccount = new BankAccount(500, "Mike Jones", "555555");

		System.out.println(myAccount.getBalance());
		System.out.println(myAccount);

		objectPassing(myAccount);
		System.out.println("Value of bank account after objectPassing executes: " + myAccount);

		int var = 10;
		System.out.println("The value of the original int is: " + var);

		primitivePassing(var);
		System.out.println("The value of the orginal in variable after primitivePassing executes is : " + var);

	}

	private static void objectPassing(BankAccount acct)
	{
		acct.deposit(200);
		System.out.println("Value of bank account in objectPassing: " + acct);

	}

	private static void primitivePassing(int num)
	{
		num -= 5;
		System.out.println("The parameter - 5 is: " + num);
	}

}
