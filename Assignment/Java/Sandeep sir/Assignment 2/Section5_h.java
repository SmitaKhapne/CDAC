//h. Declare a method-local variable strNumber of type String with some long value and convert it to the corresponding wrapper class using Long.valueOf(). (Hint: //Use Long.valueOf(String)).

package Assignment_2;

public class Section5_h 
{
	public static void main(String[] args)
	{
		String strNumber = "110000";
		long s = Long.valueOf(strNumber);
		 
		System.out.println(s);
	}

}
