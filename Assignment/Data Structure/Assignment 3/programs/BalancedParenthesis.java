import java.util.Scanner;

public class BalancedParanthesis 
{
	int size, top;
	char[] arr;
	
	BalancedParanthesis(int size)
	{
		arr = new char[size];
		top = -1;
		this.size = size;
	}
	
	boolean isEmpty()
	{
		return (top == -1);
	}
	
	boolean isFull()
	{
		return (top == size-1);
	}
	
	boolean push(char x)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
			return false;
		}
		arr[++top] = x;
		return true;
	}
	

	char pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return ' ';
		}
		char x = arr[top--];
		return x;
	}
	
	char peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return ' ';
		}
		
		return arr[top];
	}
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			for(int i=0; i<=top; i++)
			{
				System.out.println(arr[i]);
			}
		}
		
	}
	
	void insertOrPop(char bracket1)
	{
		if(bracket1 == '(' || bracket1 == '{'|| bracket1 == '[')
		{
			push(bracket1);
		}
		else
		{
			char bracket2 = peek();
			boolean isPair = this.isMatchingPair(bracket1, bracket2);
			if (isPair) {
				pop();
			} else {
				push(bracket1);
			}
		}
			
	}
	
	boolean isMatchingPair(char bracket1, char bracket2)
	{
		switch(bracket2)
		{
			case '(':
				return Character.valueOf(bracket1).equals(')');
			case '{' :
				return Character.valueOf(bracket1).equals('}');
			case '[':
				return Character.valueOf(bracket1).equals(']');
		}
		
		return false;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.nextLine();
		System.out.println("Input: " + str);
		
		BalancedParanthesis b = new BalancedParanthesis(str.length());
		
		char[] charArr = str.toCharArray();
		
		for(int i=0; i<charArr.length; i++)
		{
			b.insertOrPop(charArr[i]);
		}
		
		if (b.isEmpty()) {
			System.out.println("Balanced");
		} else {
			System.out.println("not balanced");
		}

	}

}