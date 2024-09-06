//k. Declare an integer variable with the value 7. Convert it to binary, octal, and hexadecimal strings using methods from the Integer class. (Hint: Use //Integer.toBinaryString(int), Integer.toOctalString(int), and Integer.toHexString(int)).


package Assignment_2;

public class Section4_k 
{
	public static void main(String[] args) 
	{
		int num = 7;
		
		String binary = Integer.toBinaryString(num);
		
		String octal = Integer.toOctalString(num);
		
		String hexa = Integer.toHexString(num);
		
		System.out.println("binary :" +binary);
		System.out.println("octal:" +octal);
		System.out.println("hexa :" +hexa);
		
	}

}
