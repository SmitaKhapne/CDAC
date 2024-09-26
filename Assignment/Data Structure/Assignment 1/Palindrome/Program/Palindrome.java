/*9. Integer Palindrome
Problem: Write a Java program to check if a given integer is a palindrome.

Test Cases:

Input: 121
Output: true
Input: -121
Output: false
*/
import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int num = sc.nextInt();
		
		int original = num;
		int digit=0;
		int sum=0;
		while(num > 0)
		{
			digit = num % 10;
			sum = sum * 10 + digit;
			num = num / 10;
		}
		
		if(original == sum)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}