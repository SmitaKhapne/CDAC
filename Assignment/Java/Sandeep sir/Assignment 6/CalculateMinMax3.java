package assignment_6;

import java.util.Scanner;

public class CalculateMinMax3 {

	public static void acceptRecord(int[] arr, Scanner sc)
	{
		System.out.println("enter array elements");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	public static int calcMin(int[] arr)
	{
		int min=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int calcMax(int[] arr)
	{
		int max = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void printRecord(int min, int max)
	{
		System.out.println("Maximum value in array: " + max);
		System.out.println("Minimum value in array: " + min);
	}

	public static void main(String[] args)
	{
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		acceptRecord(arr, sc);
		
		printRecord(calcMax(arr), calcMin(arr));
	}

}
