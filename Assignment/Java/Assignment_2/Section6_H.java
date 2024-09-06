//h. Declare a method-local variable strNumber of type String with some float value and convert it to the corresponding wrapper class using Float.valueOf(). (Hint: //Use Float.valueOf(String)).

package Assignment_2;

public class Section6_H 
{
	public static void main(String[] args)
	{
		String strNumber = "11.12";
		float s = Float.valueOf(strNumber);
		 
		System.out.println(s);
	}

}
