public class Pattern11
{
	public static void main(String[] args)
	{
	    for(int i=9; i>=1; i--)
	    {
	        if(i % 2 != 0)
	        {
	            for (int j=1; j<=9-i; j++)
	            {
	                System.out.print(" ");
	            }
	            for(int k=1; k<=i; k++)
	            {
	                System.out.print("* ");
	            }
	           System.out.println();
	        }
	    }
	    
        for (int i=3; i<=9; i++)
	    {
	        if (i%2 != 0)
	        {
	            for (int j=1; j<=9-i; j++)
	            {
	                System.out.print(" ");
	            }
	            for (int k=1; k<=i; k++)
	            {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	    
    }
}