public class Pattern10
{
	public static void main(String[] args)
	{
		for(int i=1; i<=9; i++)
		{
		    if(i == 1 || i % 2 != 0)
		    {
		        for(int j=1; j<=i; j++)
		        {
		            if(j == 1 || j % 2 != 0 )
		            {
		                System.out.print(j);
		            }
		            if(i != j && j % 2 != 0)
		            {
		                System.out.print("*");
		            }
		        }
		        System.out.println();
		   }
		    
		}
		
	}
}