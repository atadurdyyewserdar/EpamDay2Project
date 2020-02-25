package by.javatr.task4.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.validation.DataValidation;

public class Main
{
    public static void main(String[] args)
    {
		try
		{
			String pass = "secret";
			boolean res = false;
			if (args.length != 0)
			{
				res = pass.equals(args[0]);
			}
			else
			{
				System.out.print("Enter password:");
				String tempPass = DataScanner.enterStringFromConsole();
				res = pass.equals(tempPass);
			}
			System.out.println("Result: " + res);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
    }
}
