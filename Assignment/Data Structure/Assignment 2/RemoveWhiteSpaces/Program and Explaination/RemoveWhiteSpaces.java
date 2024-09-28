/*3. Remove White Spaces from String
Problem: Write a Java program to remove all white spaces from a given string.

Test Cases:

Input: "Hello World"
Output: "HelloWorld"
Input: "  Java   Programming  "
Output: "JavaProgramming"
*/

import java.util.Scanner;
public class RemoveWhiteSpaces
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str1 = "Hello World";
		System.out.println("Input : " + str1);
		
		//System.out.println("Enter String");
		//String str3 = sc.nextLine();
		//System.out.println("Input: " + str3);
		
		String str2 = "  Java   Programming  ";
		System.out.println("Input : " + str2);
		
		String temp1 = str1.replaceAll("[^a-zA-z]","");
		
		String temp2 = str2.replaceAll("[^a-zA-z]","");
		
		System.out.println(temp1);
		System.out.println(temp2);
	}
}


/*
ExPLAINATION:
1. Take a String.
2. Apply inbuild string class method to remove spaces.

*/