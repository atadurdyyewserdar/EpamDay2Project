package by.javatr.task5.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task5.util.Task5Logic;

public class Main
{
    public static void main(String[] args)
    {
		try
		{
			int a, b, c, d;
			int sum = 0;
			if (args.length != 4 && args.length > 0)
			{
				throw new Exception("Wrong command line arguments");
			}
			else if (args.length == 4)
			{
				a = Integer.parseInt(args[0]);
				b = Integer.parseInt(args[1]);
				c = Integer.parseInt(args[2]);
				d = Integer.parseInt(args[3]);
				sum = Task5Logic.sumOfIntegers(a,b,c,d);
			}
			else
			{
				a = DataScanner.enterIntFromConsole();
				b = DataScanner.enterIntFromConsole();
				c = DataScanner.enterIntFromConsole();
				d = DataScanner.enterIntFromConsole();
				sum = Task5Logic.sumOfIntegers(a,b,c,d);
			}
			System.out.println("Result: " + sum);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
    }
}