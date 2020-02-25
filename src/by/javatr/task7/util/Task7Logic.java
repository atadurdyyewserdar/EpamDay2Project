package by.javatr.task7.util;

import by.javatr.validation.DataValidation;
import java.util.Calendar;

public class Task7Logic
{
	public static final String[] DAY_OF_WEEK = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	
	public static String getDayOfWeek(int day, int month, int year) throws Exception
	{ 
		if (!DataValidation.validateDate(day, month, year)){
			throw new Exception("Invalid date");
		}
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, --month, day);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		return DAY_OF_WEEK[--dayOfWeek];
	}
	
	
	public static Calendar getBirthDayDate(int day, int month, int year) throws Exception
	{
		if (!DataValidation.validateDate(day, month, year))
		{
			throw new Exception("Invalid parametres");
		}
		Calendar cal =  Calendar.getInstance();
		cal.set(year, --month, day);
		return cal;
	}
	
	public static int getAge(Calendar calendar) throws Exception
	{
		if (calendar == null)
		{
			throw new Exception("Null argument");
		}
		Calendar cal = Calendar.getInstance();
		int currMonth = cal.get(Calendar.MONTH);
		int currYear = cal.get(Calendar.YEAR);
		int currDay = cal.get(Calendar.DATE);
		int age = currYear - calendar.get(Calendar.YEAR);
		if ((currMonth < calendar.get(Calendar.MONTH))
				|| (calendar.get(Calendar.MONTH) == currMonth && currDay < calendar.get(Calendar.DATE))
			)
		{
			age--;
		}
		return age;
	}
	
	public static boolean isBirthDay(Calendar calendar) throws Exception 
	{
		if (calendar == null){
			throw new Exception("Null argumnent");
		}
		boolean isBirth = false;
		Calendar cal = Calendar.getInstance();
		if (cal.get(Calendar.DATE) == calendar.get(Calendar.DATE) 
			&& cal.get(Calendar.MONTH) == calendar.get(Calendar.MONTH))
			{
				isBirth = true;
			}
		return isBirth;
	}
}
