//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a float value. (Hint: parseFloat method will //throw a NumberFormatException).

package Assignment_2;

public class Section6_F 
{
	public static void main(String[] args) 
	{
		String strNumber = "ab12c3";
		float s = Float.parseFloat(strNumber);
		 
		 System.out.println(s);

	}

}
