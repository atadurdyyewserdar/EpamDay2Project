package by.javatr.task6.runner;

import by.javatr.task6.util.*;
import by.javatr.scanner.DataScanner;
import java.util.Calendar;

public class Main
{
    public static void main(String[] args)
    {
		try
		{
			String devName = DataScanner.enterStringFromConsole();
			int days = DataScanner.enterIntFromConsole();
			Calendar cal = Task6Logic.calculate(days);
			System.out.println("Surname: " + devName);
			System.out.println("Finish time: " + cal.getTime());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
    }
}
