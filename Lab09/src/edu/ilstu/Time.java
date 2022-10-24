/*
 * Created on: %{date}
 *
 * ULID: mcamp10
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * <insert class description here>
 *
 * @author Montrell Campbell & zcboeh1 Zack Boehm
 *
 */
public class Time
{

	private int hours;
	private int minutes;

	public Time()
	{
		this.hours = 00;
		this.minutes = 00;
	}

	public Time(int hours, int minutes)
	{
		if (hours > 23 || hours < 0 || minutes > 59 || minutes < 0)
		{
			this.hours = 00;
			this.minutes = 00;
		} else
		{
			this.hours = hours;
			this.minutes = minutes;
		}

	}

	public Time(int hours, int minutes, String amPM)
	{

		if (hours < 0 || hours > 12 || minutes > 59
				|| minutes < 0 && !amPM.equalsIgnoreCase("AM") && !amPM.equalsIgnoreCase("PM"))
		{
			hours = 00;
			minutes = 00;
		}

		else if (this.hours < 12 && amPM.equalsIgnoreCase("PM"))
		{
			this.hours = 12 + hours;
			this.minutes = minutes;
		}

		else
		{
			this.hours = hours;
			this.minutes = minutes;
		}

	}

	public void setHours(int hours)
	{
		if (hours >= 0 && hours <= 23)
		{
			this.hours = hours;
		}
	}

	public int getHours()
	{
		return hours;
	}

	public void setMinutes(int minutes)
	{
		if (minutes >= 0 && minutes <= 59)
		{
			this.minutes = minutes;
		}

	}

	public int getMinutes()
	{
		return minutes;
	}

	public boolean equals(Time t2)
	{
		if (this.hours == t2.getHours() && this.minutes == t2.getMinutes())
		{
			return true;
		} else
			return false;
	}

	public String toString()
	{
		return hours + ":" + minutes;
	}

	public String get12HourTime()
	{
		int timeConversion = this.hours % 12;

		if (timeConversion == 0)
		{
			timeConversion = 12;
		}

		if (this.hours >= 12)
		{
			return timeConversion + ":" + minutes + " " + "PM";
		}

		return hours + ":" + minutes + " " + "AM";

	}

}
