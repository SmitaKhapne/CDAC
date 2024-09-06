//d. Declare a method-local variable number of type byte with some value and convert it to a String using the toString method. (Hint: Use Byte.toString(byte)).
package Assignment_2;

public class Section2_4 
{
	public static void main(String[] args)
	{
		byte num = 10;
		String s1 = Byte.toString(num);
		
		System.out.println(s1);
	}

}
