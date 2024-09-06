//Declare a method-local variable strStatus of type String with the value "true" and convert it to the corresponding wrapper class using Boolean.valueOf(). (Hint: //Use Boolean.valueOf(String))

package Assignment_2;

public class Section1_F
{
	public static void main(String[] args)
	{
		String strStatus = "true";
		boolean b= Boolean.valueOf(strStatus);
		System.out.println(b);
	}

}
