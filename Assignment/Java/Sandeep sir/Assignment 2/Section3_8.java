//h. Declare a method-local variable strNumber of type String with some short value and convert it to the corresponding wrapper class using Short.valueOf(). (Hint: //Use Short.valueOf(String)).

package Assignment_2;

public class Section3_8 
{
	public static void main(String[] args)
	{
		String strNumber = "11";
		short s = Short.valueOf(strNumber);
		 
		System.out.println(s);
	}
}

