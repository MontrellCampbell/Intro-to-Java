import java.util.Scanner;

/*
 * Created on: %{date}
 *
 * ULID: mcamp10
 * Class: IT 168 
 */

/**
 * <insert class description here>
 *
 * @author Montrell Campbell
 *
 */
public class ElectionApp
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input;
		Results result1 = new Results();

		do
		{
			System.out.println("Choose from the following options: ");
			System.out.println(
					"1- Add candidate\n2- Add votes\n3- Determine winner\n4- Display a list of candidates\n5- Display winners\n6- Exit");
			input = scan.nextInt();

			switch (input)
			{
			case 1:
			{
				result1.addCandidate();

				System.out.println(result1.candidateArr[0]);

				break;
			}
			case 2:
			{

				result1.addVotes();
				break;
			}
			case 3:
			{
				result1.determineWinner();

				break;
			}
			case 4:
			{
				for (int i = 0; i < result1.candidateArr.length; i++)
				{
					System.out.println(result1.candidateArr[i]);
				}
				break;
			}
			case 5:
			{
				result1.displayWinners();
				break;

			}
			case 6:
			{
				System.out.println("Goodbye!");
				break;

			}

			default:
				break;
			}

		} while (input != 6);
	}

}
