//. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a double value. (Hint: parseDouble method will //throw a NumberFormatException).

package Assignment_2;

public class Section7_F 
{
	public static void main(String[] args) 
	{
		String strNumber = "ab12c3";
		double s = Double.parseDouble(strNumber);
		 
		 System.out.println(s);

	}


}
