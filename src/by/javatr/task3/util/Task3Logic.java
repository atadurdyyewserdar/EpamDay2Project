package by.javatr.task3.util;

import java.lang.Math;

public class Task3Logic
{
	public static int[] getRandomizedArray(int length) throws Exception
	{	
		if (length < 0)
		{
			throw new Exception("wring array size");
		}
		
		int [] array = new int[length];
		
		for (int i = 0; i < length;i++)
		{
			array[i] = (int) (Math.random() * 100);
		}
		
		return array;	
	}
}