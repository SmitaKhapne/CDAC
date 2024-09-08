//m. Experiment with converting a float value into other primitive types or vice versa and observe the results.

package Assignment_2;

public class Section6_M 
{
	public static void main(String[] args)
	{
			float b = 25.0f;
			
			Float fRef = Float.valueOf(b);
			
			int n = (int)b;
			System.out.println("int:"+n);
			
			long f = (long)b;
			System.out.println("long:" +f);
	    
			double d = (double)b;
			System.out.println("double:"+d);
			
			
			short num = 29;
			
			int fh = 25;
			
			double d1 = 56;
			
			System.out.println("short:" + num);
			System.out.println("int:" + fh);
			System.out.println("double:" + d1);
		}

	}
