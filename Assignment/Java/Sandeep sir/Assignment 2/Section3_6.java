//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a short value. (Hint: parseShort method will //throw a NumberFormatException).

package Assignment_2;

public class Section3_6 
{
	public static void main(String[] args)
	{
		String strNumber = "a1b2c3";
		 short s = Short.parseShort(strNumber);
		 
		 System.out.println(s);
	}
}
