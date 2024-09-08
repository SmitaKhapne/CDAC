//j. Declare two long variables with values 1122 and 5566, and find the minimum and maximum values using the Long class. (Hint: Use Long.min(long, long) and //Long.max(long, long)).

package Assignment_2;

public class Section5_j 
{
	public static void main(String[] args)
	{
		long a=1122;
		long b=5566;
		
		long min = Long.min(a, b);
		long max = Long.max(a, b);
		
		System.out.println("min is :" +min);
		System.out.println("max is:" +max);
	}

}
