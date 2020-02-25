package by.javatr.task3.util;

public class Task3Printer
{
	public static void printLine(int[] mas) throws Exception
	{
		if (mas == null)
		{
			throw new Exception("given array null");
		}
		for (int i = 0;i<mas.length;i++)
		{
			System.out.print(mas[i] + " ");
		}
	}
	
	public static void printInNewLine(int[] mas) throws Exception
	{
		if (mas == null)
		{
			throw new Exception("given array null");
		}
		for (int i = 0;i<mas.length;i++)
		{
			System.out.println(mas[i]);
		}
	}
}