//g. Declare a method-local variable number of type byte with some value and convert it to the corresponding wrapper class using Byte.valueOf(). (Hint: Use //Byte.valueOf(byte)).
package Assignment_2;

public class Section2_7 
{
	public static void main(String[] args)
	{
		byte b = 50;
		byte b1 = Byte.valueOf(b);
		System.out.println(b1);
	}

}
