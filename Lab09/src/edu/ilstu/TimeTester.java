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
public class TimeTester
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Time time1 = new Time(2, 30);
		System.out.println(
				"time 1 " + "object created with hours: " + time1.getHours() + " and minutes: " + time1.getMinutes());

		Time time2 = new Time(2, 45, "PM");
		System.out.println(
				"time 2 " + "object created with hours: " + time2.getHours() + " and minutes: " + time2.getMinutes());

		Time time3 = new Time(11, 45);
		System.out.println(
				"time 3 " + "object created with hours: " + time3.getHours() + " and minutes: " + time3.getMinutes());
		Time time4 = new Time(25, 50);
		System.out.println(
				"time 4 " + "object created with hours: " + time4.getHours() + " and minutes: " + time4.getMinutes());
		time3.setMinutes(68);
		System.out.println(time3.getMinutes());

		System.out.println(time3.equals(time2));

		System.out.println(time3);

		System.out.println(time3.get12HourTime());

	}

}
