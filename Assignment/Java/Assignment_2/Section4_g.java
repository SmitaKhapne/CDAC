//g. Declare a method-local variable number of type int with some value and convert it to the corresponding wrapper class using Integer.valueOf(). (Hint: Use //Integer.valueOf(int)).
package Assignment_2;

public class Section4_g 
{
	public static void main(String[] args)
	{
		int number = 100;
		int s = Integer.valueOf(number);
		 
		 System.out.println(s);
	}

}
