//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a byte value. (Hint: parseByte method will //throw a NumberFormatException).
package Assignment_2;

public class Section2_6 
{
	public static void main(String[] args)
	{
		String strNumber = "Ab12Cd3";
		
		byte b = Byte.parseByte(strNumber);
	}

}
