//h. Declare a method-local variable strNumber of type String with some double value and convert it to the corresponding wrapper class using Double.valueOf(). //(Hint: Use Double.valueOf(String)).

package Assignment_2;

public class Section7_H 
{
	public static void main(String[] args)
	{
		String strNumber = "11123.12890";
		double s = Double.valueOf(strNumber);
		 
		System.out.println(s);
	}


}
