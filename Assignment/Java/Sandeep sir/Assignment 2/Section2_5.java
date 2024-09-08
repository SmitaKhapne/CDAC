//e. Declare a method-local variable strNumber of type String with some value and convert it to a byte value using the parseByte method. (Hint: Use //Byte.parseByte(String)).
package Assignment_2;

public class Section2_5 
{
	public static void main(String[] args)
	{
		String strNumber = "25";
		
		byte b1 = Byte.parseByte(strNumber);
		System.out.println(b1);
	}

}
