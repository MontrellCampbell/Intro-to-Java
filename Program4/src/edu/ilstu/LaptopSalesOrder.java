/**
 * 
 */
package edu.ilstu;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This class takes the price of the laptop the user chooses and calculates the
 * Taxes and totals for both the laptop and the prepaid sale options
 * 
 * @author montrell
 *
 */
public class LaptopSalesOrder
{

	static Laptop laptop;
	static LaptopSaleApp LSA;

	public final double laptopSalesTax = 0.035;
	public final double supportSalesTax = 0.08;
	public final double supportRebate = 0.02;

	final double basicsetupPackage = 199.99;
	final double virusMalwareRemoval = 99.50;
	final double productivitySoftware = 299.99;

	public String orderDate;
	public double orderPrice;
	public String laptopDescription;
	public double laptopPrice;
	public double laptopTax;
	public double laptopSubtotal;
	public double supportpackagePrice;
	public double supportpackageTax;
	public double supportpackageSubtotal;
	public double supportDollars;
	public double supportpackageRebate;
	public String basicsetupConfigPackageIndicator;
	public String removeVirusMalwareIndicator;
	public String productivitySoftwareIndicator;

	DecimalFormat formatted = new DecimalFormat("$#.##");
	LocalDateTime dateTime = LocalDateTime.now();
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
	String formattedDate = dateTime.format(myFormatObj);

	public LaptopSalesOrder()
	{

		System.out.println(formattedDate);
	}

	/**
	 * Constructor
	 * 
	 * @param laptopPrice      - the price of the laptop
	 * @param laptopDecription - the laptop description
	 * 
	 */
	public LaptopSalesOrder(double laptopPrice, String laptopDescription)
	{

		this.laptopPrice = laptopPrice;
		this.laptopDescription = laptopDescription;
		setLaptopPrice(laptopPrice);

	}

	/**
	 * Getter for the laptop Description
	 */

	public String getLaptopDescription()
	{
		return laptopDescription;
	}

	/**
	 * Getter for support dollars
	 */
	public double getSupportDollars()
	{
		return supportDollars;
	}

	/**
	 * Getter for the package indicators
	 */
	public String getSupportPackageInidcators()
	{
		return basicsetupConfigPackageIndicator + " " + removeVirusMalwareIndicator + " "
				+ productivitySoftwareIndicator;
	}

	/**
	 * Setter for the laptop Description
	 */

	public void setLaptopDescription(String laptopDescription)
	{
		this.laptopDescription = laptopDescription;
	}

	/**
	 * Setter for the laptop price, which calculates the laptop tax, support
	 * dollars, and the subtotal
	 */

	public void setLaptopPrice(double laptopPrice)
	{
		this.laptopPrice = laptopPrice;
		formatted.format(laptopPrice);
		laptopTax = laptopPrice * laptopSalesTax;
		formatted.format(laptopTax);
		supportDollars = laptopPrice * supportRebate;
		laptopSubtotal = laptopPrice + laptopTax;
		orderPrice = laptopSubtotal + supportpackageSubtotal;

	}

	/**
	 * Setter for the package indicators
	 */
	public void setSupportPackageIndicators(String basicsetupConfigPackageIndicator, String removeVirusMalwareIndicator,
			String productivitySoftwareIndicator)
	{
		this.basicsetupConfigPackageIndicator = basicsetupConfigPackageIndicator;
		this.removeVirusMalwareIndicator = removeVirusMalwareIndicator;
		this.productivitySoftwareIndicator = productivitySoftwareIndicator;

		calculateOrderLineItemCosts();
	}

	/**
	 * Calculates the prepaid support options based on what the user chooses
	 */
	private void calculateOrderLineItemCosts()
	{
		if (basicsetupConfigPackageIndicator.equals("	basicsetupConfigPackage\n"))
		{
			supportpackagePrice += basicsetupPackage;

		}
		if (removeVirusMalwareIndicator.equals("	removeVirusMalwarePackage\n"))
		{
			supportpackagePrice += virusMalwareRemoval;

		}
		if (productivitySoftwareIndicator.equals("	productivitySoftwarePackage\n"))
		{
			supportpackagePrice += productivitySoftware;
		}
		supportpackageRebate = supportDollars;
		supportpackageTax = supportpackagePrice * supportSalesTax;
		formatted.format(supportpackageTax);
		if (supportpackagePrice == 0)
		{
			supportpackageSubtotal = supportpackagePrice + supportpackageTax;
		} else
			supportpackageSubtotal = supportpackagePrice + supportpackageTax - supportpackageRebate;

	}

	/**
	 * toString method that prints out the receipt for both the laptop and the
	 * prepaid options and adds them together for the grand total
	 */

	public String toString()
	{

		return "TERRIFIC TECHNOLOGIES SALES ORDER RECEIPT\n" + "Order Date: " + formattedDate
				+ "\n-----------------------------------------------------------------------\n"
				+ "Item								Amount\n-----------------------------------------------------------------------"
				+ "\nLaptop\n	" + laptopDescription.substring(0) + "\n\nSale Price							"
				+ formatted.format(laptopPrice) + "\nSales Tax 							" + formatted.format(laptopTax)
				+ "\nSubtotal 							" + formatted.format(laptopSubtotal) + "\n\nService Package\n"
				+ basicsetupConfigPackageIndicator + removeVirusMalwareIndicator + productivitySoftwareIndicator + "\n"

				+ "Sale Price 							" + formatted.format(supportpackagePrice)
				+ "\nSales Tax 							" + formatted.format(supportpackageTax)
				+ "\nSubtotal 							" + formatted.format(supportpackageSubtotal)
				+ "\nRebate							 	" + formatted.format(supportpackageRebate)
				+ "\n-----------------------------------------------------------------------\n"
				+ "Grand Total 							" + formatted.format(laptopSubtotal + supportpackageSubtotal)
				+ "\n-----------------------------------------------------------------------";
	}
}
