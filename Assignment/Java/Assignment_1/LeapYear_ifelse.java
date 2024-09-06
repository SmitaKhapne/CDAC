//print leap year using if-else 
package javaprogram;

import java.util.Scanner;

public class LeapYear_ifelse 
{
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter year");
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			System.out.println(year + " is a leap year");
		}
		else
		{
			System.out.println(year + " is not leap year");
		}
			
				
	}

}
