//l. Experiment with converting a long value into other primitive types or vice versa and observe the results.

package Assignment_2;

public class Section5_l 
{
	public static void main(String[] args) 
	{
		long b = 25;
		
		int n = Long.valueOf(b).intValue();
		System.out.println("Long:"+b);
    
		float f = Float.valueOf(b);
		System.out.println("float:" +f);
    
		double d = Double.valueOf(b);
		System.out.println("double:"+d);
		
		
		short num = 29;
		
		float fh = 25;
		
		double d1 = 56;
		
		System.out.println("short:" + num);
		System.out.println("float:" + fh);
		System.out.println("double:" + d1);
	}

}
