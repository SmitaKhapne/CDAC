//h. Declare a method-local variable strNumber of type String with some byte value and convert it to the corresponding wrapper class using Byte.valueOf(). (Hint: //Use Byte.valueOf(String)).
package Assignment_2;

public class Section2_8 
{
	public static void main(String[] args)
	{
		String strNumber = "125";
		byte b = Byte.valueOf(strNumber);
		
		System.out.println(b);
	}

}
