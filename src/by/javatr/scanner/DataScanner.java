package by.javatr.scanner;

import java.util.Scanner;

public class DataScanner
{
    public static int enterIntFromConsole(){
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while (!scanner.hasNextInt()){
            scanner.next();
        }
        a = scanner.nextInt();
        return a;
    }

    public static double enterDoubleFromConsole(){
        Scanner scanner = new Scanner(System.in);
        double a = 0.0;
        while (!scanner.hasNextDouble()){
            scanner.next();
        }
        a = scanner.nextDouble();
        return a;
    }
	
	public static String enterStringFromConsole(){
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		return line;
	}
}
