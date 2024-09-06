//e. Declare a method-local variable status of type boolean with the value true and convert it to the corresponding wrapper class using Boolean.valueOf(). (Hint: //Use Boolean.valueOf(boolean)).
package Assignment_2;

public class Section1_E
{
	public static void main(String[] args)
	{
		boolean status = true;
		String str = Boolean.valueOf(status);
		System.out.println(str);
	}

}
