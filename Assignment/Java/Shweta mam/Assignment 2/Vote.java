//Write a program that checks if a person is eligible to vote based on their age.

package javaprogram;

import java.util.Scanner;

public class Vote 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		if(age > 18)
		{
			System.out.println("Eligible for Voting");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}
}
