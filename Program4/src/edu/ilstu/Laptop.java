package edu.ilstu;

/**
 * This class holds everything about the laptop including the brand, model, cpu
 * type, RAM and price;
 */
public class Laptop
{

	LaptopSalesOrder LSO;

	public String brand;
	public String model;
	public String cpuType;
	public String RAM;
	public double price;

	/**
	 * Constructor
	 * 
	 * @param laptopPrice - the price of the laptop
	 * @param model       - the laptop model
	 * @param cpuType     - the type of cpu in the laptop
	 */
	public Laptop(String brand, String model, String cpuType)
	{
		this.brand = brand;
		this.model = model;

	}

	/**
	 * Getter for the laptop brand
	 */
	public String getBrand()
	{
		return this.brand;

	}

	/**
	 * Getter for the laptop model
	 */
	public String getModel()
	{
		return this.model;

	}

	/**
	 * Getter for the cpu type
	 */
	public String getCpuType()
	{
		return this.cpuType;

	}

	/**
	 * Getter for the laptop's RAM
	 */
	public String getRAM()
	{
		return this.RAM;

	}

	/**
	 * Getter for the laptop's price
	 */
	public double getPrice()
	{
		return this.price;

	}

	/**
	 * Setter for the laptop's price
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}

	/**
	 * Setter for the RAM
	 */
	public void setRAM(String RAM)
	{
		this.RAM = RAM;
	}

	/**
	 * toString method that returns the brand. model, cpu type, and the RAM.
	 */
	public String toString()
	{
		return brand + " " + model + " " + cpuType + " " + RAM;
	}

}
