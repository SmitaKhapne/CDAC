//e. Declare a method-local variable strNumber of type String with some value and convert it to a long value using the parseLong method. (Hint: Use //Long.parseLong(String)).

package Assignment_2;

public class Section5_e 
{
	public static void main(String[] args)
	{
		String strNumber = "111";
		long s = Long.parseLong(strNumber);
		 
		 System.out.println(s);
	}

}
