//b. Write a program to test how many bytes are used to represent a byte value using the BYTES field. (Hint: Use Byte.BYTES).

package Assignment_2;

public class Section2_2
{
	public static void main(String[] args)
	{
		byte b= Byte.BYTES;
		System.out.println("bytes size of BYTE is :" +b);
		
		int i= Integer.BYTES;
		System.out.println("bytes size of INTEGER is :" +i);
		
		float f= Float.BYTES;
		System.out.println("bytes size of FLOAT is :" +f);
		
		double d = Double.BYTES;
		System.out.println("bytes size of DOUBLE is :" +d);
		
	}

}
