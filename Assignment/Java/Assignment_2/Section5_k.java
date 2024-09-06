//k. Declare a long variable with the value 7. Convert it to binary, octal, and hexadecimal strings using methods from the Long class. (Hint: Use //Long.toBinaryString(long), Long.toOctalString(long), and Long.toHexString(long)).

package Assignment_2;

public class Section5_k {

	public static void main(String[] args) 
	{
		long num = 7;
		
		String binary = Long.toBinaryString(num);
		
		String octal = Long.toOctalString(num);
		
		String hexa = Long.toHexString(num);
		
		System.out.println("binary :" +binary);
		System.out.println("octal:" +octal);
		System.out.println("hexa :" +hexa);

	}

}
