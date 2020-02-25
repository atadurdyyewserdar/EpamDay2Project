package by.javatr.task5.util;

public class Task5Logic
{
    public static int sumOfIntegers(int...nums)
    {
		int sum = 0;
		for(int a : nums)
		{
			sum += a;
		}
        return sum;
    }
}
