/*2. Prime Number
Problem: Write a Java program to check if a given number is prime.

Test Cases:

Input: 29
Output: true
Input: 15
Output: false
*/

import java.util.Scanner;
public class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		
		for(int i=2; i<num; i++)
		{
			if(num % i == 0)
			{
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
	}

}