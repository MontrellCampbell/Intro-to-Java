import java.util.Scanner;

/*
 * 04/21/2022
 *
 * ULID: mcamp10
 * Class: IT 168 
 */

/**
 * This class obtains the results for each candidate and their parties.
 * 
 *
 * @author Montrell Campbell
 *
 */
public class Results
{

	Candidate candidate;

	public final int BLOCK_SIZE = 3;

	public Candidate[] candidateArr;
	public int candidateElements;
	public String[] officeArr;
	public int officeElements;

	Scanner input = new Scanner(System.in);

	/**
	 * Default constructor that sets the candidate array equal to the block size,
	 * office array to the block size and the candidateElements and office elements
	 * equal to 0
	 */
	public Results()
	{
		this.candidateArr = new Candidate[BLOCK_SIZE];
		this.officeArr = new String[BLOCK_SIZE];
		this.candidateElements = 0;
		this.officeElements = 0;
	}

	/**
	 * getter for the Candidate size
	 */
	public int getCandidateSize()
	{
		return this.candidateElements;
	}

	/**
	 * getter for the office size
	 */
	public int getOfficeSize()
	{
		return this.officeElements;
	}

	/**
	 * converts the candidate array to a formatted string
	 */
	public String toString()
	{
		String toString = null;
		for (int i = 0; i < candidateElements; i++)
		{
			toString = candidateArr[i].toString() + "\n";
		}
		return toString;
	}

	/**
	 * checks the candidate array to see if the candidate is already present in the
	 * array
	 */
	public boolean hasCandidate(Candidate c)
	{
		boolean hasCandidate1 = false;

		for (int i = 0; i < candidateElements; i++)
		{
			if (candidateArr[i].equals(c))
			{
				hasCandidate1 = true;
			}

		}

		return hasCandidate1;
	}

	/**
	 * checks the candidate array to see if it full
	 */
	public boolean isCandidatesFull()
	{
		boolean isCandidateFull = false;

		if (candidateElements == candidateArr.length)
		{
			isCandidateFull = true;
		}

		return isCandidateFull;
	}

	/**
	 * checks to see if the office array is full
	 */
	public boolean isOfficeFull()
	{

		boolean isOfficeFull = false;

		if (officeElements == officeArr.length)
		{
			isOfficeFull = true;
		}
		return isOfficeFull;

	}

	/**
	 * prompts the user to enter a new candidate and checks to see if that candidate
	 * is already in the ballot
	 */
	public void addCandidate()
	{
		Candidate candidate = new Candidate(" ", " ", " ", " ");

		System.out.println("Enter the first name of the Candidate");
		candidate.firstName = input.next();
		System.out.println("Enter the last name of the Candidate");
		candidate.lastName = input.next();
		System.out.println("Enter the office of the Candidate");
		candidate.office = input.next();
		System.out.println("Enter the party of the Candidate");
		candidate.party = input.next();

		if (hasCandidate(candidate) == true)
		{
			System.out.println("Candidate is already on ballot");
		} else
			addCandidate(candidate);

	}

	/**
	 * adds the candidate from the previous add candidate method to the candidate
	 * array and adds the office to the office array
	 */
	private void addCandidate(Candidate c)
	{

		candidateArr[candidateElements] = c;
		candidateElements++;

		if (isOfficeFull() == true)
		{
			resizeOffice();
		}

		officeArr[officeElements] = c.office;
		officeElements++;

	}

	/**
	 * resizes the candidate array if it is full
	 */
	public void resizeCandidate()
	{
		Candidate[] tempCandidateArr = new Candidate[candidateArr.length + BLOCK_SIZE];

		for (int i = 0; i < candidateElements; i++)
		{
			candidateArr[i] = tempCandidateArr[i];
		}

	}

	/**
	 * resizes the office array if it is full
	 */
	public void resizeOffice()
	{
		String[] tempOfficeArr = new String[officeArr.length + BLOCK_SIZE];

		for (int i = 0; i < candidateElements; i++)
		{
			officeArr[i] = tempOfficeArr[i];
		}
	}

	/**
	 * adds votes to the candidates in the candidates array
	 */
	public void addVotes()
	{
		Scanner scan = new Scanner(System.in);
		int setVote = 0;

		for (int i = 0; i < candidateElements; i++)
		{

			if (candidateArr[i].totalVotes > 0)
			{
				System.out.print(
						"Enter new votes for " + candidateArr[i].getfirstName() + candidateArr[i].getlastName() + ": ");
				setVote = scan.nextInt();
				candidateArr[i].setTotalVotes(candidateArr[i].totalVotes += setVote);
				System.out.println(candidateArr[i].getTotalVotes());
			}

			if (candidateArr[i].totalVotes == 0)
			{
				System.out.print(
						"Enter new votes for " + candidateArr[i].getfirstName() + candidateArr[i].getlastName() + ": ");
				setVote = scan.nextInt();
				candidateArr[i].setTotalVotes(setVote);
				System.out.println(candidateArr[i].getTotalVotes());
			}

		}
	}

	/**
	 * Determines the winner of out of all of the candidates in a specific party
	 */
	public void determineWinner()
	{
		System.out.println("Choose an office \n 1- President \n 2- Senator");
		int chooseCandidate = input.nextInt();

		int highestVotes = 0;

		if (chooseCandidate == 1)
		{

			for (int i = 0; i < candidateArr.length; i++)
			{
				if (candidateArr[i].getOffice().equalsIgnoreCase("President"))
				{
					System.out.println(candidateArr[i] + "\n");

				}

				if (candidateArr[i].getTotalVotes() > highestVotes)
				{
					highestVotes = candidateArr[i].getTotalVotes();
				}
			}

			for (int i = 0; i < candidateArr.length; i++)
			{

				if (candidateArr[i].getTotalVotes() == highestVotes)
				{
					System.out.println(
							candidateArr[i].getfirstName() + " " + candidateArr[i].lastName + " is the winner");
				}
			}

		}

		if (chooseCandidate == 2)
		{

			for (int i = 0; i < candidateArr.length; i++)
			{
				if (candidateArr[i].getOffice().equalsIgnoreCase("Senator"))
				{
					System.out.println(candidateArr[i] + "\n");
				}

				if (candidateArr[i].getTotalVotes() > highestVotes)
				{
					highestVotes = candidateArr[i].getTotalVotes();
				}

			}

			for (int i = 0; i < candidateArr.length; i++)
			{

				if (candidateArr[i].getTotalVotes() == highestVotes)
				{
					System.out.println(
							candidateArr[i].getfirstName() + " " + candidateArr[i].lastName + " is the winner");
				}
			}

		}

	}

	/**
	 * creates an array for the candidates that share the same office
	 */
	private Candidate[] createCandidateListByOffice()
	{
		System.out.print("Enter the office: ");
		String candidateByOfficeInput = input.next();
		Candidate[] candidateArrByOffice = new Candidate[BLOCK_SIZE];

		for (int i = 0; i < candidateArr.length; i++)
		{
			if (candidateByOfficeInput.equalsIgnoreCase(candidateArr[i].office))
			{
				candidateArrByOffice[i] = candidateArr[i];
			}
		}
		return candidateArrByOffice;
	}

	/**
	 * finds the candidate with the highest votes and determines who the winner is.
	 */
	private void findHighestVotes()
	{

		int mostVotes = 0;
		int tieCounter = 0;

		Candidate[] List = createCandidateListByOffice();

		if (List.length == 1)
		{
			for (int i = 0; i < List.length; i++)
			{
				if (List[i].totalVotes > 0)
				{
					System.out.println("Winner is: ");
					System.out.println(List[i]);
				}
				if (List[i].totalVotes == 0)
					System.out.println("Candidate has no votes. Winner cannot be determined");
			}
		}

		if (List.length > 1)
		{
			for (int i = 0; i < List.length; i++)
			{
				if (List[i].totalVotes > mostVotes)
				{
					mostVotes = List[i].totalVotes;
				}
			}

			for (int j = 0; j < List.length; j++)
			{
				if (List[j].getTotalVotes() == mostVotes)
				{
					tieCounter++;
				}

				if (tieCounter > 1)
				{
					System.out.println("There is no winner");
					break;
				}
			}

			if (tieCounter < 2)
			{
				for (int k = 0; k < List.length; k++)
				{
					if (List[k].totalVotes == mostVotes)
					{
						System.out.println("The winners are");

						List[k].setWonOrLost(true);
					}
				}
			}
		}
	}

	/**
	 * displays the winners
	 */
	public void displayWinners()
	{
		findHighestVotes();

		for (int i = 0; i < candidateArr.length; i++)
		{
			if (candidateArr[i].wonOrLost == true)
			{
				System.out.println(candidateArr[i]);
			}
		}
	}

}
