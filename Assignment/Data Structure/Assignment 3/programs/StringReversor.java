import java.util.Arrays;
import java.util.Scanner;

public class StringReversor 
{
	int top;
	int size;
	char[] arr;
	
	public StringReversor(int size) 
	{
		top = -1;
		this.size = size;
		arr = new char[size];
	}
	
	boolean isEmpty()
	{
		return (top ==-1);
	}
	
	boolean isFull()
	{
		return (top == size-1);
	}
	
	boolean push(char x)
	{
		if(isFull())
		{
			System.out.println("Full");
			return false;
		}

		else
		{
			arr[++top] = x;
			return true;
		}
	}
	
	char pop()
	{
		if(isEmpty())
		{
			System.out.println("empty");
			return ' ';
		}

		else
		{
		    return arr[top--];
			
		}
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		StringReversor string = new StringReversor(5);
		String str = sc.next();
		int count =0;
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++)
		{
			string.push(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(string.pop());
		}
	}
}
