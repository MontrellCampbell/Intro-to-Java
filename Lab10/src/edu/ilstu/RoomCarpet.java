package edu.ilstu;

/**
 * Gets the cost per square foot and times it by the area of the room to get the
 * total cost
 *
 * @author Montrell Campbell & zcboeh1 Zack Boehm
 *
 */

public class RoomCarpet
{

	double CPSQ;
	RoomDimension rd;

	public RoomCarpet(double CPSQ, RoomDimension rd)
	{
		this.CPSQ = CPSQ;
		this.rd = rd;

	}

	public double getTotalCost()

	{
		return rd.area() * CPSQ;
	}

}
