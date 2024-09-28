/*4. Reverse a String
Problem: Write a Java program to reverse a given string.

Test Cases:

Input: "hello"
Output: "olleh"
Input: "Java"
Output: "avaJ"

*/


import java.util.Scanner;

public class ReverseString {
	
	public static void printReverseStr(String str)
	{
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length/2; i++)
		{
			char temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		System.out.println(String.valueOf(arr));		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first String");
		String str1 = sc.nextLine();
		
		System.out.println("enter second String");
		String str2 = sc.nextLine();
		
		printReverseStr(str1);
		printReverseStr(str2);
		

	}

}


/*
ExPLAINATION:
1. Take a string.
2. convert a string into character array.
3. Apply for loop upto half of the array length.
4. apply swapping technique and print array.
*/