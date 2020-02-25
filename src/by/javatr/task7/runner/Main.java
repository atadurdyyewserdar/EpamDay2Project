package by.javatr.task7.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task7.util.Task7Logic;

public class Main
{
    public static void main(String[] args)
    {
		
		try
		{
			if (args.length != 3 && args.length > 0)
			{
				throw new Exception("Wrong arguments...");
			}
			else if (args.length == 3)
			{
				int day, month, year;
				
				day = Integer.parseInt(args[0]);
				month = Integer.parseInt(args[1]);
				year = Integer.parseInt(args[2]);
				
				System.out.println("Day of birthDay: " + Task7Logic.getDayOfWeek(day, month, year));
				System.out.println("Full date of birthDay: " + Task7Logic.getBirthDayDate(day, month, year).getTime());
				System.out.println("Your age: " + Task7Logic.getAge(Task7Logic.getBirthDayDate(day, month, year)));
				if (Task7Logic.isBirthDay(Task7Logic.getBirthDayDate(day, month, year))){
					System.out.println("Happy birthday to you!!!");
				}
			}
			else
			{
				int day, month, year;
				
				day = DataScanner.enterIntFromConsole();
				month = DataScanner.enterIntFromConsole();
				year = DataScanner.enterIntFromConsole();
				
				System.out.println("Day of birthDay: " + Task7Logic.getDayOfWeek(day, month, year));
				System.out.println("Full date of birthDay: " + Task7Logic.getBirthDayDate(day, month, year).getTime());
				System.out.println("Your age: " + Task7Logic.getAge(Task7Logic.getBirthDayDate(day, month, year)));
				if (Task7Logic.isBirthDay(Task7Logic.getBirthDayDate(day, month, year))){
					System.out.println("Happy birthday to you!!!");
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
        
    }
}
