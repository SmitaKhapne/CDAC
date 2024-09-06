//g. Declare a method-local variable number of type float with some value and convert it to the corresponding wrapper class using Float.valueOf(). (Hint: Use //Float.valueOf(float)).

package Assignment_2;

public class Section6_G 
{
	public static void main(String[] args)
	{
		float number = 100;
		float s = Float.valueOf(number);
		 
		 System.out.println(s);
	}

}
