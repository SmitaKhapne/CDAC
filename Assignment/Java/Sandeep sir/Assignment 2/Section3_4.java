//d. Declare a method-local variable number of type short with some value and convert it to a String using the toString method. (Hint: Use Short.toString(short)).

package Assignment_2;

public class Section3_4 
{
	public static void main(String[] args)
	{
		short number = 234;
		String s = Short.toString(number);
		
		System.out.println(s);
		
	}

}
