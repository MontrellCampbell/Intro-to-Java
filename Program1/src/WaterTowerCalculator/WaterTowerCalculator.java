package WaterTowerCalculator;

import java.util.Scanner;

public class WaterTowerCalculator
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("ENTER THE WIDTH OF THE SPHERE IN INCHES : ");

		double width = input.nextDouble();
		double radius = width / 2;
		double radiusSQ = width * width;
		double radiusCU = width * width * width;
		double pi = 3.14;
		double constants = 7.48;

///////////////////////////////////////////////////////////////////

		double Areaininches = pi * radiusSQ;
		double Areainfeet = Areaininches / 144;
		double Volumeininches = (4.0 / 3.0) * pi * (radius * radius * radius);
		double Volumeinfeet = Volumeininches / 1728;
		double Gallonsofwater = Volumeinfeet * constants;

		System.out.printf("Area in inches: " + "%.2f" + "\n", Areaininches);
		System.out.printf("Area in feet: " + "%.2f" + "\n", Areainfeet);
		System.out.printf("Volume in inches: " + "%.2f" + "\n", Volumeininches);
		System.out.printf("Volume in feet: " + "%.2f" + "\n", Volumeinfeet);
		System.out.printf("Gallons of water: " + "%.2f" + "\n", Gallonsofwater);

	}

}
