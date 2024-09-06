/*9. Default Values of Primitive Types
Declare variables of each primitive type as fields of a class and check their default values. (Note: Default values depend on whether the variables are instance variables or static variables).
*/

package Assignment_2;

class Program
{
	
	boolean b;
	byte bt;
	short s;
	int i;
	long l;
	float f;
	double d;
	
	public void printPrimitive()
	{
		System.out.println("boolean:" + b);
		System.out.println("byte:" +bt);
		System.out.println("short:"+s);
		System.out.println("int:"+i);
		System.out.println("long:" +l);
		System.out.println("float:" +f);
		System.out.println("double:" +d);
	}
}
public class Section_9 
{
	public static void main(String[] args)
	{
		Program p = new Program();
		p.printPrimitive();
	}

}
