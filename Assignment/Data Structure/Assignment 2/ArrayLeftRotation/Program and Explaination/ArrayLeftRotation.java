/*10. Array Left Rotation
Problem: Write a Java program to rotate an array to the left by d positions.

Test Cases:

Input: arr = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Input: arr = [10, 20, 30, 40], d = 1
Output: [20, 30, 40, 10]

*/


import java.util.Scanner;

public class ArrayLeftRotation 
{
	public static int[] acceptArrayInput(Scanner sc)
	{
	
		System.out.println("Enter length of array");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		
		System.out.println("enter array element");
		for(int i =0; i< arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public static void printArrayBasedOnIndex(int[] arr, int index)
	{
		int i;
		for(i=index; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		for(i=0; i<index; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int[] arr = acceptArrayInput(sc);
		
		System.out.println("Enter index value u want to print from");
		int index = sc.nextInt();
		
		printArrayBasedOnIndex(arr, index);
		sc.close();
		
	}

}


/*
ExPLAINATION:
1. Take a array.
2. Apply for-loop from given index value to length and print.
3. Again, apply for-loop from 0 to index and print.
*/