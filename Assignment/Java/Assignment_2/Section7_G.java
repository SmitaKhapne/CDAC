//g. Declare a method-local variable number of type double with some value and convert it to the corresponding wrapper class using Double.valueOf(). (Hint: Use //Double.valueOf(double)).

package Assignment_2;

public class Section7_G 
{
	public static void main(String[] args)
	{
		double number = 100.234567;
		double  s = Double.valueOf(number);
		 
		 System.out.println(s);
	}


}
