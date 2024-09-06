//g. Declare a method-local variable number of type long with some value and convert it to the corresponding wrapper class using Long.valueOf(). (Hint: Use //Long.valueOf(long)).

package Assignment_2;

public class Section5_g 
{
	public static void main(String[] args)
	{
		long number = 100;
		long s = Long.valueOf(number);
		 
		 System.out.println(s);
	}

}
