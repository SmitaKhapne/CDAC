//Write a program that takes a month (1-12) and prints the corresponding season 
//(Winter, Spring, Summer, Autumn) using a switch case

package javaprogram;

import java.util.Scanner;

public class SeasonDetails 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter month");
		int month = sc.nextInt();
		
		switch(month)
		{
		case 1: 
		case 2:
		case 12: 
				System.out.println("Winter");
				break;
				
		case 3: 
		case 4:
		case 5: 
				System.out.println("Spring");
				break;
				
		case 6: 
		case 7:
		case 8: 
				System.out.println("Summer");
				break;
			    
		case 9: 
		case 10:
		case 11: 
				System.out.println("Autumn");
				break;
		}
	}

}
