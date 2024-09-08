//d. Declare a method-local variable number of type double with some value and convert it to a String using the toString method. (Hint: Use //Double.toString(double)).

package Assignment_2;

public class Section7_D 
{
	public static void main(String[] args)
	{
		double number = 234234.9876;
		String s = Double.toString(number);
		
		System.out.println(s);
		
	}

}
