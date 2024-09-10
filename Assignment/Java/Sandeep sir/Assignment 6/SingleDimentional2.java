package assignment_6;

import java.util.Scanner;

public class SingleDimentional2 
{
	
	public static void acceptRecord(int arr[], Scanner sc)
	{
		System.out.println("enter array elements");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	public static void printRecord(int[] arr)
	{
		System.out.println("Array element:");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println( arr[i]);
		}
	}
	

	public static void main(String[] args) 
	{
		
		int[]arr = new int[5];
		Scanner sc = new Scanner(System.in);
		acceptRecord(arr,sc);
		printRecord(arr);
		
		
	}

}
