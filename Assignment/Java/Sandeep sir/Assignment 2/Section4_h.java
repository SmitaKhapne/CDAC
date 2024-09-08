//h. Declare a method-local variable strNumber of type String with some integer value and convert it to the corresponding wrapper class using Integer.valueOf(). //(Hint: Use Integer.valueOf(String)).
package Assignment_2;

public class Section4_h 
{
	public static void main(String[] args)
	{
		String strNumber = "11";
		int s = Integer.valueOf(strNumber);
		 
		System.out.println(s);
	}

}
