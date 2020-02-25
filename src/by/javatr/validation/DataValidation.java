package by.javatr.validation;

import java.util.Calendar;

public class DataValidation{
	
	public static final int CURRENT_YEAR = 2020;
	private final static int[] DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static int parseInt(String num) throws NumberFormatException{
		int a = Integer.parseInt(num);
		return a;
	}
	
	public static double parseDouble(String num) throws NumberFormatException{
		double a = Double.parseDouble(num);
		return a;
	}
	
	public static boolean validateDate(int day, int month, int year)
	{
		boolean isValid = false;
		if ((month < 13 && month > 0) && (year >= 0 && year <= CURRENT_YEAR) && day > 0)
        {
			int result = DAYS[month-1];
			if ((year % 100 != 0 || year % 400 == 0) && year % 4 == 0 && month == 2)
			{
				++result;
			}
			if(day <= result)
			{
				isValid = true;
			}
		}
		return isValid;
	}
	
}