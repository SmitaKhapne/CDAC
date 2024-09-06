//. Declare a method-local variable strStatus of type String with the value "1" or "0" and attempt to convert it to a boolean. (Hint: parseBoolean method will not work as expected with "1" or "0").
package Assignment_2;

public class Section1_D 
{
	public static void main(String[] args)
	{
		String strStatus = "0";
		boolean bool = Boolean.parseBoolean(strStatus) ;
		System.out.println(bool);
	}

}
