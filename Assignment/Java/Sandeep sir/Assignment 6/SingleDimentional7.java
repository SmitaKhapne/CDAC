package assignment_6;

import java.util.Scanner;


class Array
{
	private int[] arr;
	
	public Array(int[] arr) 
	{
		this.arr = arr;
	}

	public void acceptRecord( Scanner sc)
	{
		System.out.println("enter array element");
		for(int i=0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	public void printRecord(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Array element: "+arr[i]);
		}
	}
}
public class SingleDimentional7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		Array a = new Array(arr);
		a.acceptRecord(sc);
		a.printRecord(arr);
		
		sc.close();
		
	}

}
