/*1. Armstrong Number
Problem: Write a Java program to check if a given number is an Armstrong number
		Test Cases:

		Input: 153
		Output: true
		Input: 123
		Output: false
*/


import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = num;
		
		int digit=0;
		int cube=1;
		int sum=0;
		while(num > 0)
		{
			digit = num % 10;
			cube = digit * digit * digit;
			sum += cube;
			num = num / 10;
		}
		
		if(temp == sum)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}



