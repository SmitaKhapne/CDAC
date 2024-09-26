/*3. Factorial
Problem: Write a Java program to compute the factorial of a given number.

Test Cases:

Input: 5
Output: 120
Input: 0
Output: 1
*/

import java.util.Scanner;
public class Factorial
{
	public static int printfact(int num)
	{
		if(num <= 0)
		{
			return 1;
		}
		else
			return num * printfact(num -1);
	}	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		
		int fact = printfact(num);
		System.out.println(fact);
		
	}
}