/*
2. Remove Array Duplicates
Problem: Write a Java program to remove duplicates from a sorted array and return the new length of the array.

Test Cases:

Input: arr = [1, 1, 2]
Output: 2
Input: arr = [0, 0, 1, 1, 2, 2, 3, 3]
Output: 4
*/




import java.util.Scanner;

public class DuplicateRemover {
	
	public static int[] readArrayInput()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter array size");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		
		System.out.println("Enter array");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		return arr;
	}
	
	
	public static void findDuplicate(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					removeDuplicate(arr, j);
					break;
				}
			}
		}
	}
	
	public static void removeDuplicate(int[]arr, int index)
	{
		for(int i=index; i<arr.length-1; i++)
		{
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = -1;
		
	}
	
	public static int getLengthAfterDuplicateRemoval(int[] arr)
	{
		int length=0;
		for(int i : arr)
		{
			if(i == -1)
			{
				break;
			}
			length++;
		}
		return length;
	}

	public static void main(String[] args) 
	{
		
		int[] arr = readArrayInput();
		
		findDuplicate(arr);
		System.out.println("length = " + getLengthAfterDuplicateRemoval(arr));
		
		
	}

}


/*
EXPLAINATION:
1. Take array size  and array elements from user.
2. Take 2 for loop, outer loop taking an element from array and inner for-loop comparing with rest of array elements.
3. Apply if condition for checking duplicate values.
4. If duplicate found then replace that value with next value present in array and fill that value by 0 or -1.
*/