package edu.ilstu;

/**
 * gets the dimensions of the room (length & width) also converts the length and
 * width to a string
 *
 * @author Montrell Campbell & zcboeh1 Zack Boehm
 *
 */

public class RoomDimension
{

	public int length;
	public int width;

	public RoomDimension(int length, int width)
	{

		this.length = length;
		this.width = width;

	}

	public int area()

	{
		return this.length * this.width;
	}

	public String toString()

	{
		return "The area is" + this.length * this.width;
	}

}
