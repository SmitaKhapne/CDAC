/*8. Conversion between Primitive Types and Strings
Initialize a variable of each primitive type with a user-defined value and convert it into String:
o	First, use the toString method of the corresponding wrapper class. (e.g., Integer.toString()).
o	Then, use the valueOf method of the String class. (e.g., String.valueOf()).
*/


package Assignment_2;

public class Section_8 
{
	public static void main(String[] args)
	{
	boolean b = true;
	byte bt = 12;
	short s = 50;
	int i = 100;
	long l = 123456;
	float f = 1123f;
	double d = 12345.4321;
	
	System.out.println("***using toString***");
	String s1 = Boolean.toString(b);
	System.out.println("boolean to string :" +s1);
	
	String s2 = Byte.toString(bt);
	System.out.println("byte to string :" +s2);
	
	String s3 = Short.toString(s);
	System.out.println("short to string :" +s3);
	
	String s4 = Integer.toString(i);
	System.out.println("int to string :" +s4);
	
	String s5 = Long.toString(l);
	System.out.println("Long to string :" +s5);
	
	String s6 = Float.toString(f);
	System.out.println("float to string :" +s6);
	
	String s7 = Double.toString(d);
	System.out.println("double to string :" +s7);
	
	System.out.println("**********************************************************");
	
	System.out.println("***using valueOf***");
	
	String s8 = String.valueOf(b);
	System.out.println("boolean to string :" +s8);
	
	String s9 = String.valueOf(bt);
	System.out.println("byte to string :" +s9);
	
	String s10 = String.valueOf(s);
	System.out.println("short to string :" +s10);
	
	String s11 = String.valueOf(i);
	System.out.println("int to string :" +s11);
	
	String s12 = String.valueOf(l);
	System.out.println("Long to string :" +s12);
	
	String s13 = String.valueOf(f);
	System.out.println("float to string :" +s13);
	
	String s14 = String.valueOf(d);
	System.out.println("double to string :" +s14);
	}

}
