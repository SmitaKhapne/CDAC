//j. Declare two integer variables with values 10 and 20, and find the minimum and maximum values using the Integer class. (Hint: Use Integer.min(int, int) and //Integer.max(int, int)).
package Assignment_2;

public class Section4_j 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		
		int min = Integer.min(a, b);
		int max = Integer.max(a, b);
		
		System.out.println("min is :" +min);
		System.out.println("max is:" +max);
	}
}
