package edu.ilstu;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This class allows the user to choose a laptop and pre-paid support options
 */

public class LaptopSaleApp
{

	static LaptopSalesOrder LSO;
	static Laptop laptop;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		selectLaptop();
		selectSupportOptions();
		System.out.println(LSO.toString());

	}

	static DecimalFormat formatted = new DecimalFormat("$#.##");

	/**
	 * allows the user to enter an integer that corresponds to the laptop items
	 */

	public static void selectLaptop()
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Terrific Technologies!\n\n\n");
		System.out.println("Let us help you find your next laptop.\n\n\n");
		System.out.println("CHOOSE FROM OUR PROLIFIC LAPTOP INVENTORY\n");
		System.out.println("-----------------------------------------------------\n\n\nItem#	Laptop			"
				+ "CPU/Ram		" + "Price\n\n\n-----------------------------------------------------\n");

		System.out.println("1	Apple MacBook Air	Intel i7/16	$2,499.00\n");
		System.out.println("2	Dell Latitude		Intel i9/32	$1,399.00\n");
		System.out.println("3	Lenovo ThinkPad		AMD G7/8	$1,199.00\n\n\n");

		int itemNum = 0;

		do
		{
			System.out.print("Select your Laptop by item # (e.g. 1, 2, 3): ");
			itemNum = input.nextInt();

			if (itemNum == 1)
			{
				System.out.print("\n\nYou've selected the Apple MacBook Air ... a wise choice!\n\n\n");
				LSO = new LaptopSalesOrder(2499.00, "Apple MacBook Air Intel i7/16");
				laptop = new Laptop("Apple", "MacBook Air", "Intel i7/16");

			}
			if (itemNum == 2)
			{
				System.out.print("\n\nYou've selected the Dell Latitude ... a wise choice!\n\n\n");
				LSO = new LaptopSalesOrder(1399.00, "Dell Latitude Intel i9/32");
				laptop = new Laptop("Dell", "Latitude", "Intel i9/32");

			}
			if (itemNum == 3)
			{
				System.out.print("\n\nYou've selected the Lenovo Thinkpad ... a wise choice!\n\n\n");
				LSO = new LaptopSalesOrder(1199.00, "Lenovo ThinkPAd AMD G7/8");
				laptop = new Laptop("Levovo", "ThinkPad", "AMD G7/8");
			}

		} while (itemNum != 1 && itemNum != 2 && itemNum != 3);
	}

	/**
	 * allows the user to choose weather they would like to add pre-paid support
	 * options to their laptop order.
	 */
	public static void selectSupportOptions()
	{
		Scanner input = new Scanner(System.in);
		String basicsetupConfigPackageIndicator = null;
		String removeVirusMalwareIndicator = null;
		String productivitySoftwareIndicator = null;

		System.out.println("Enhance your purchase with our pre-paid support offerings.\n");
		System.out.println("Todays purchase qualifies for " + formatted.format(LSO.getSupportDollars())
				+ " in support Cash.\n\n\n");
		System.out.print("	Add our basic set up and security configuration package for $199.99 (Y or N)? ");
		String securityConfig = input.next();
		if (securityConfig.equalsIgnoreCase("Y"))
		{
			basicsetupConfigPackageIndicator = "	basicsetupConfigPackage\n";
		}
		if (securityConfig.equalsIgnoreCase("N"))
		{
			basicsetupConfigPackageIndicator = "";
		}
		System.out.print("	Add our virus or malware removal package for $99.50 (Y or N)?");
		String virusmalwareRemoval = input.next();
		if (virusmalwareRemoval.equalsIgnoreCase("Y"))
		{
			removeVirusMalwareIndicator = "	removeVirusMalwarePackage\n";
		}
		if (virusmalwareRemoval.equalsIgnoreCase("N"))
		{
			removeVirusMalwareIndicator = "";
		}
		System.out.print("	Add our productivity software installation package for $299.99 (Y or N)?");
		String softwareInstallation = input.next();
		if (softwareInstallation.equalsIgnoreCase("Y"))
		{
			productivitySoftwareIndicator = "	productivitySoftwarePackage\n";
		}
		if (softwareInstallation.equalsIgnoreCase("N"))
		{
			productivitySoftwareIndicator = "";
		}
		System.out.println("\n\n\nCongratulation on you purchase!\n\n\n----------------------------------------"
				+ "------------------------------");
		LSO.setSupportPackageIndicators(basicsetupConfigPackageIndicator, removeVirusMalwareIndicator,
				productivitySoftwareIndicator);
	}

}
