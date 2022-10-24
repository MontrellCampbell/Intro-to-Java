/*
 * Created on: %{date}
 *
 * ULID: mcamp10
 * Class: IT 168 
 */

/**
 * This class holds all the information about the candidate, weather they won or
 * lost and their total votes
 *
 * @author Montrell Campbell
 *
 */
public class Candidate
{

	public String firstName;
	public String lastName;
	public String office;
	public String party;
	public int totalVotes;
	public boolean wonOrLost;

	/**
	 * Constructor that takes the first and last name, the office, and the party of
	 * the candidate
	 */
	public Candidate(String firstName, String lastName, String office, String party)

	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.office = office;
		this.party = party;
	}

	/**
	 * Constructor that takes a candidate
	 */
	public Candidate(Candidate candidate)
	{
		this(candidate.firstName, candidate.lastName, candidate.office, candidate.party);
	}

	/**
	 * getter for the candidates first name
	 */
	public String getfirstName()
	{
		return this.firstName;
	}

	/**
	 * getter for the candidates last name
	 */
	public String getlastName()
	{
		return this.lastName;
	}

	/**
	 * getter for the candidates office
	 */
	public String getOffice()
	{
		return this.office;
	}

	/**
	 * getter for the candidates party
	 */
	public String getParty()
	{
		return this.party;
	}

	/**
	 * getter for the candidates total votes
	 */
	public int getTotalVotes()
	{
		return this.totalVotes;
	}

	/**
	 * getter for weather the candidate won or lost
	 */
	public boolean getWinOrLost()
	{
		return this.wonOrLost;
	}

	/*
	 * setter for the total votes
	 */
	public void setTotalVotes(int totalVotes)
	{
		this.totalVotes = totalVotes;
	}

	/**
	 * setter for weather the candidate won or lost
	 * 
	 */
	public void setWonOrLost(boolean wonOrLost)
	{
		this.wonOrLost = wonOrLost;
	}

	/**
	 * to string method that formats all of the information about the candidate
	 */
	public String toString()
	{
		return "Candidate: " + firstName + " " + lastName + "\n" + "Office: " + office + "\n" + "Party: " + party + "\n"
				+ "Total Votes: " + totalVotes;
	}

	/**
	 * is equal method that takes in the first and last name of one candidate to
	 * determine if they are equal to another candidate.
	 */
	public boolean isEqual(String firstName, String lastName)
	{
		boolean equal;

		if (this.firstName.equals(firstName) && this.lastName.equals(lastName))
			equal = true;

		else
			equal = false;

		return equal;
	}

}
