import java.util.Arrays;
/*5. Reverse Array in Place
Problem: Write a Java program to reverse an array in place.

Test Cases:

Input: arr = [1, 2, 3, 4]
Output: [4, 3, 2, 1]
Input: arr = [7, 8, 9]
Output: [9, 8, 7]
*/


import java.util.Scanner;

public class ArrayReversor 
{
	
	public static void reverseArray(int[] arr)
	{
		for(int i=0; i<arr.length/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size of array");
		int size = sc.nextInt();
		
		int[] arr= new int[size];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		reverseArray(arr);

	}

}


/*
ExPLAINATION:
1. Take a array.
2. Apply for loop upto half of the array length.
3. apply swapping technique and print array.

*/

