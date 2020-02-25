package by.javatr.task6.util;

import java.util.Calendar;

public class Task6Logic
{	
	public static Calendar calculate(int days) throws Exception
	{
		if (days < 0)
		{
			throw new Exception("Wrong parametr");
		}
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, days);
		return cal;
	}
}
