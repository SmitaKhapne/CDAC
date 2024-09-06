//d. Declare a method-local variable number of type long with some value and convert it to a String using the toString method. (Hint: Use Long.toString(long)).

package Assignment_2;

public class Section5_d 
{
	public static void main(String[] args)
	{
		long number = 234;
		String s = Long.toString(number);
		
		System.out.println(s);
		
	}
	
}
