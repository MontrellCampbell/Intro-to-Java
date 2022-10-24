import java.util.Scanner;

public class Car {
	
	final double economyRate = 30;
	final double luxuryRate = 40;
	final double fullSizeCar = 35;
	final double fullSizeVan = 50;
	final double convertibleRate =50;
	
	String make;
	String model;
	int VIN;
	int year;
	String category;
	int milage;
	String customer;
	boolean reservationFlag;
	int oilChangeMilage;
	
	Scanner scan = new Scanner(System.in);
	
	public Car(String make, String model, int VIN, int year, int milage, int oilChangeMilage, boolean reservationFlag, String category)
	{
		this.make = make;
		this.model = model;
		this.VIN = VIN;
		this.year = year;
		this.milage = milage;
		this.oilChangeMilage = oilChangeMilage;
		this.reservationFlag = reservationFlag;
		this.category = category;
	
	}
	
	public Car(String make, String model, int VIN, int year, int milage, int oilChangeMilage, boolean reservationFlag, String category, String customer)
	{
		
		this( make, model, VIN, year, milage, oilChangeMilage, reservationFlag, category);
		this.customer = customer;
	}
	
	public void updateMiles(int newMiles)
	{
		this.milage += newMiles;
	}

	public void oilChange()
	{
		if (this.oilChangeMilage >= 2700)
		{
			System.out.println("Flagged for oil change");
		}
		
		else 
			System.out.println("No oil change needed at this time");
	}
	
	public String getMake ()
	{
		return this.make;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public int getVIN()
	{
		return this.VIN;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public String getCategory()
	{
		return this.category;
	}
	
	public int getMilage()
	{
	return this.milage;
	}
	
	public boolean getReservationFlag()
	{
		return reservationFlag;
	}
	
	public int getOilChangeMilage()
	{ 
		return this.oilChangeMilage;
	}
	
	public void setMilage(int newMilage)
	{
		this.milage = newMilage;
	}
	
	public void setReservationFlag(boolean reservationFlag)
	{
		this.reservationFlag = reservationFlag;
	}
	
	public void setOilChangeMilage(int newOilChangeMilage)
	{
		this.oilChangeMilage = newOilChangeMilage;
	}
	
	public String toString()
	{
		return "Make		" + make + "\n" 
				+ "Model		" + model + "\n" 
				+ "year		" + year 
				+ "VIN		" + VIN + "\n" 
				+ "Category		" + category+ "\n"
				+ "Total Milage		" + milage+ "\n"
				+ "Reserved		" + reservationFlag;
	}
	

}
