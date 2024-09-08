//Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a long value. (Hint: parseLong method will throw a //NumberFormatException).

package Assignment_2;

public class Section5_f 
{
	public static void main(String[] args) 
	{
		String strNumber = "ab12c3";
		long s = Long.parseLong(strNumber);
		 
		 System.out.println(s);

	}

}
