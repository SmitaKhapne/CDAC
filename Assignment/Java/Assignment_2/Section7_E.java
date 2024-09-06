//e. Declare a method-local variable strNumber of type String with some value and convert it to a double value using the parseDouble method. (Hint: Use //Double.parseDouble(String)).

package Assignment_2;

public class Section7_E
{
	public static void main(String[] args)
	{
		String strNumber = "111334.678";
		double s = Double.parseDouble(strNumber);
		 
		 System.out.println(s);
	}


}
