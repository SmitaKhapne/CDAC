/*7. Reverse a Number
Problem: Write a Java program to reverse a given number.

Test Cases:

Input: 12345
Output: 54321
Input: -9876
Output: -6789

*/


import java.util.Scanner;

public class NumberReversor {
	
	public static void reverseNumber(int num) {
		boolean isNegative=false;
		if(num < 0)
		{
			isNegative= true;
			num = Math.abs(num);
		}
		
		int newNumber=0;
		int digit=0;
		while(num > 0)
		{
			digit = num % 10;
			newNumber = newNumber * 10 + digit;
			num = num / 10;
		}
		if(isNegative)
		{
			System.out.println("-" + newNumber);
		}
		else
			System.out.println(newNumber);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("enter second number");
		int num2 = sc.nextInt();
		
		reverseNumber(num1);
		reverseNumber(num2);

	}

}


/*
ExPLAINATION:
1. Take a array.
2. Take while-loop and find out digit in reverse manner and print.

*/