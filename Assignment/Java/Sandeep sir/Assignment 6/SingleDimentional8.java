package assignment_6;

import java.util.Scanner;

class Array1
{
	private int[] arr;
	
	public Array1() {
	
	}
	
	public Array1(int[] arr) 
	{
		this.arr = arr;
	}

	public int[] getArr() 
	{
		return arr;
	}

	public void setArr(int[] arr)
	{
		this.arr = arr;
	}
	
}

public class SingleDimentional8 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Array1 obj = new Array1();
		
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		obj.setArr(arr);
		
		int[] arr2 = obj.getArr();
		for (int i=0; i < arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		sc.close();

	}

}
