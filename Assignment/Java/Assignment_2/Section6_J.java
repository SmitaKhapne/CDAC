//j. Declare two float variables with values 112.2 and 556.6, and find the minimum and maximum values using the Float class. (Hint: Use Float.min(float, float) and //Float.max(float, float)).

package Assignment_2;

public class Section6_J 
{
	public static void main(String[] args)
	{
		float a=(float)112.2;
		float b=(float)556.6;
		
		float min = Float.min(a, b);
		float max = Float.max(a, b);
		
		System.out.println("min is :" +min);
		System.out.println("max is:" +max);
	}

}
