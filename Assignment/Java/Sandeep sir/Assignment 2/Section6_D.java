//d. Declare a method-local variable number of type float with some value and convert it to a String using the toString method. (Hint: Use Float.toString(float)).

package Assignment_2;

public class Section6_D 
{
	public static void main(String[] args)
	{
		float number = 234;
		String s = Float.toString(number);
		
		System.out.println(s);
		
	}
	

}
