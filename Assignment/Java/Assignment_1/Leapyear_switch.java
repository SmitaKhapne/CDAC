package javaprogram;

import java.util.Scanner;

public class Leapyear_switch 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year");
		int year = sc.nextInt();
		
		System.out.println("Enter number to find year is leap or not");
		int num = sc.nextInt();
		
		switch(num)
		{
			case 1: 
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				{
					System.out.println(year + " is a leap year");
				}
				else
				{
					System.out.println(year + "not leap year");
				}
				break;
			default: 
				System.out.println("Invalid year");
				break;
		}
	}
}
