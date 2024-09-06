//j. Declare two double variables with values 112.2 and 556.6, and find the minimum and maximum values using the Double class. (Hint: Use Double.min(double, //double) and Double.max(double, double)).

package Assignment_2;

public class Section7_J 
{
	public static void main(String[] args)
	{
		double a=112.2;
		double b=556.6;
		
		double min = Double.min(a, b);
		double max = Double.max(a, b);
		
		System.out.println("min is :" +min);
		System.out.println("max is:" +max);
	}

}
