import java.util.Scanner;

public class Lab11
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int[] arr = new int[100];
		int counter;
		counter = fillArray(arr, input);
		int product = computeProduct(arr, counter);
		System.out.println("The product of the array is " + product);
		int factor;
		System.out.print("Enter an integer: ");
		factor = input.nextInt();
		System.out.println("count of multiples for factors is : " + countMultiples(arr, counter, factor));
		System.out.println("values of array");
		printArray(arr, counter);

	}

	public static int fillArray(int[] arr, Scanner scan)
	{

		int count = 0;
		int val = 0;

		while (true)
		{
			System.out.println("Enter a value (-999 to quit)");
			val = scan.nextInt();

			if (val == -999)
			{
				break;
			}

			arr[count] = val;
			count++;

		}

		return count;
	}

	public static int computeProduct(int[] arr, int counter)
	{

		int product = 1;

		for (int i = 0; i < counter; i++)

			product = product * arr[i];

		return product;

	}

	public static int countMultiples(int[] arr, int counter, int factor)
	{
		int count = 0;
		for (int i = 0; i < counter; i++)
		{
			if (arr[i] % factor == 0)
			{
				count++;
			}

		}
		return count;
	}

	public static void printArray(int[] arr, int counter)
	{
		for (int i = 0; i < counter; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
