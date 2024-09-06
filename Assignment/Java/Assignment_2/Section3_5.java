//e. Declare a method-local variable strNumber of type String with some value and convert it to a short value using the parseShort method. (Hint: Use //Short.parseShort(String)).

package Assignment_2;

public class Section3_5 
{
	public static void main(String[] args)
	{
		String strNumber = "321";
		 short s = Short.parseShort(strNumber);
		 
		 System.out.println(s);
	}

}
