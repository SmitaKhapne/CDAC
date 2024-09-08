//i. Experiment with converting a short value into other primitive types or vice versa and observe the results
package Assignment_2;

public class Section3_9 
{
	public static void main(String[] args)
	{
		short b = 25;
	
		int n = Integer.valueOf(b);
		System.out.println("int:"+b);
    
		float f = Float.valueOf(b);
		System.out.println("float:" +f);
    
		double d = Double.valueOf(b);
		System.out.println("double:"+d);
		
		
		int num = 29;
		
		float fl = 25;
		
		double d1 = 56;
		
		System.out.println("int:" +(short)num);
		System.out.println("float:" +(short)fl);
		System.out.println("double:" +(short)d1);
	}
}
