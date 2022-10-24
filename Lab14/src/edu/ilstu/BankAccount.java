/*
 * Filename: BankAccount.java 
 * Last modified on November 15, 2020 
 * 
 * Course: IT 168
 */
package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This is a simple bank account class.
 * 
 * @author Montrell Campbell
 * 
 */
public class BankAccount

{
	private double balance;
	private String name;
	private String acctNum;

	Scanner scan = new Scanner(System.in);

	/**
	 * Default constructor
	 */
	public BankAccount()
	{
		this(0, "", "");
	}

	/**
	 * @param initBal The initial balance of the account
	 * @param owner   The name on the account
	 * @param number  The account number
	 */
	public BankAccount(double initBal, String owner, String number)
	{
		this.balance = initBal;
		this.name = owner;
		this.acctNum = number;
	}

	/**
	 * Checks to see if balance is sufficient for withdrawal. If so, decrements
	 * balance by amount; if not, prints error message.
	 * 
	 * @param amount to be withdrawn
	 */
	public void withdraw(double amount)
	{
		if (this.balance <= amount)
			this.balance = this.balance - amount;
		else
			System.out.println("Insufficient funds");
	}

	/**
	 * Adds deposit amount to balance.
	 * 
	 * @param amount to be deposited
	 */
	public void deposit(double amount)
	{
		this.balance = this.balance + amount;
	}

	/**
	 * Getter for the balance
	 * 
	 * @return the current balance
	 */
	public double getBalance()
	{
		return this.balance;
	}

	/**
	 * Deducts a $10 fee
	 */
	public void chargeFee()
	{
		this.balance = this.balance - 10;
	}

	/**
	 * Setter for the name
	 * 
	 * @param newName The new name on the account
	 */
	public void setName(String newName)
	{
		this.name = newName;
	}

	/**
	 * to string method that displays the name, account number and the balance of
	 * the account holder
	 */
	public String toString()
	{
		return "Account holder: " + name + "\n" + "Account number: " + acctNum + "\n" + "Balance: " + balance;
	}

	/**
	 * read object that reads the file passed
	 * 
	 * @param input Scanner object to read the file
	 */
	public void read(Scanner input)
	{

		File file1 = new File("accounts.txt");
		String line;
		double num;

		try
		{
			input = new Scanner(file1);

			while (input.hasNext())
			{
				line = input.nextLine();
				num = input.nextDouble();

				if (input.hasNext())
				{
					input.hasNextLine();
				}
			}
			input.close();

		} catch (FileNotFoundException e)
		{
			System.out.println("No file found");
		}

	}

	/**
	 * writes to a file
	 * 
	 * @param output The writer to the file
	 */

	public void write(PrintWriter output)
	{
		FileWriter fw;

		try
		{
			fw = new FileWriter("output.txt", false);
			output = new PrintWriter(fw);

		} catch (IOException e)
		{

		}

	}

}
