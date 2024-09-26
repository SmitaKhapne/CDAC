/*6. Find Square Root
Problem: Write a Java program to find the square root of a given number (using integer approximation).

Test Cases:

Input: x = 16
Output: 4
Input: x = 27
Output: 5
*/

import java.util.Scanner;
import java.lang.Math;
public class SquareRoot
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int x = sc.nextInt();
		
		int sqRoot = (int)Math.sqrt(x);
		System.out.println(sqRoot);
		
	}
	
}