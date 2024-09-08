//i. Experiment with converting a byte value into other primitive types or vice versa and observe the results.
package Assignment_2;

public class Section2_9 
{
	public static void main(String[] args)
	{
		byte b = 25;
		
		int n = Integer.valueOf(b);
	    System.out.println(b);
	    
	    float f = Float.valueOf(b);
	    System.out.println("float:" +f);
	    
	    double d = Double.valueOf(b);
	    System.out.println("double:"+d);
	    
	}


}
