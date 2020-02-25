package by.javatr.task1.runner;

public class Hello
{
    public static void main(String[] args)
    {
		String helloMsg = "Hello, ";
		if (args.length != 0)
		{
			System.out.println(helloMsg + args[0]);
		}
		else
		{
			System.out.println(helloMsg + "user");
		}
    }
}