import java.util.Arrays;
import java.util.Scanner;

public class StackDemo 
{
	int top;
	int size=3;
	int[] arr = new int[size];
	
	public StackDemo() {
		top = -1;
	}
	
	boolean isEmpty()
	{
		return (top == -1);
	}
	
	boolean isFull()
	{
		return (top == size-1);
	}
	
	boolean push(int x)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
			return false;
		}
		else
		{
			arr[++top] = x;
		}
		return true;
	}
	
	int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return -1;
		}
		return arr[top--];
	}
	
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.print("[");
			for (int i=0; i <= top; i++)
			{
				System.out.print(arr[i] + " ");
			}
			System.out.println("]");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		StackDemo st = new StackDemo();
		
		System.out.println("Enter stack elemnts");
		st.push(sc.nextInt());
		st.push(sc.nextInt());
		st.push(sc.nextInt());
		
		st.display();
		
		System.out.println("popped Elments: " + st.pop());
		
		st.display();

	}

}
