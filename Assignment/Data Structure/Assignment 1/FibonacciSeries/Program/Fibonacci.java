/*4. Fibonacci Series
Problem: Write a Java program to print the first n numbers in the Fibonacci series.

Test Cases:

Input: n = 5
Output: [0, 1, 1, 2, 3]
Input: n = 8
Output: [0, 1, 1, 2, 3, 5, 8, 13]
*/

import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value to print fibonacci series");
		int n = sc.nextInt();
		
		int n1=0;
		System.out.println(n1);
		
		int n2=1;
		System.out.println(n2);
		int n3=0;
		
		while(n-2 > 0)
		{
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
			n--;
		}
		
		
	}
}