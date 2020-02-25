package by.javatr.task3.runner;

import by.javatr.task3.util.Task3Logic;
import by.javatr.task3.util.Task3Printer;

public class Main
{
    public static void main(String[] args)
    {
		if (args.length == 1)
		{
			try
			{
				int length = Integer.parseInt(args[0]);
				int mas[] = Task3Logic.getRandomizedArray(length);
				Task3Printer.printLine(mas);
				System.out.println();
				Task3Printer.printInNewLine(mas);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
    }
}
