/*5. Find GCD
Problem: Write a Java program to find the Greatest Common Divisor (GCD) of two numbers.

Test Cases:

Input: a = 54, b = 24
Output: 6
Input: a = 17, b = 13
Output: 1
*/
import java.util.Scanner;
public class CommonDivisor
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		int n1 = sc.nextInt();
		
		System.out.println("Enter a Second number");
		int n2 = sc.nextInt();
		
		int diff=0;
		int min;
		while(n1 > 0)
		{
			diff = Math.abs(n1 - n2);
			if(n1 < n2)
			{
				min = n1;
			}
			else
			{
				min = n2;
			}
			n1 = min;
			n2 = diff;
			if(n1 == n2)
			{
				System.out.println(n1);
				break;
			}
		}
	}
}