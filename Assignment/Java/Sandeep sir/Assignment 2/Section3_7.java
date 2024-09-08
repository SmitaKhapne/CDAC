//g. Declare a method-local variable number of type short with some value and convert it to the corresponding wrapper class using Short.valueOf(). (Hint: Use //Short.valueOf(short)).

package Assignment_2;

public class Section3_7 
{
	public static void main(String[] args)
	{
		short number = 100;
		 short s = Short.valueOf(number);
		 
		 System.out.println(s);
	}
}

