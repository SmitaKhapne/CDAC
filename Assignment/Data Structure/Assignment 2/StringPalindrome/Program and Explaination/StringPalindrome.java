/*9. String Palindrome
Problem: Write a Java program to check if a given string is a palindrome.

Test Cases:

Input: "madam"
Output: true
Input: "hello"
Output: false
Here’s a continuation of the list of assignment questions starting from question 21, with two test cases for each:

*/


import java.util.Scanner;

public class StringPalindrome {
	
	public static void stringReversal(String str)
	{
		String original = str;
		char[] charArr= str.toCharArray();
		char temp;
		for(int i=0; i<=charArr.length/2; i++)
		{
			temp = charArr[i];
			charArr[i] = charArr[charArr.length-1-i];
			charArr[charArr.length-1-i] = temp;
		}
		
		if(original.equals(String.valueOf(charArr)))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first String");
		String str1 = sc.nextLine();
		
		System.out.println("enter second String");
		String str2 = sc.nextLine();
			
		stringReversal(str1);
		stringReversal(str2);

	}

}


/*
ExPLAINATION:
1. Take a String.
2. convert that string to array.
3. Apply for-loop upto half to the length.
4. and Swap the character.
5. check with original string and newly created string.
*/