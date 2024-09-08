//l. Experiment with converting an int value into other primitive types or vice versa and observe the results.

package Assignment_2;

public class Section4_l {

	public static void main(String[] args) 
	{
		int b = 25;
		
		long n = Long.valueOf(b);
		System.out.println("Long:"+b);
    
		float f = Float.valueOf(b);
		System.out.println("float:" +f);
    
		double d = Double.valueOf(b);
		System.out.println("double:"+d);
		
		
		short num = 29;
		
		float fh = 25;
		
		double d1 = 56;
		
		System.out.println("short:" + (int)num);
		System.out.println("float:" + (int)fh);
		System.out.println("double:" + (int)d1);

	}

}
