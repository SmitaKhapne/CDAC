//f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to an int value. (Hint: parseInt method will throw //a NumberFormatException).
package Assignment_2;

public class Section4_f 
{
	public static void main(String[] args) 
	{
		String strNumber = "ab12c3";
		int s = Integer.parseInt(strNumber);
		 
		 System.out.println(s);

	}

}
