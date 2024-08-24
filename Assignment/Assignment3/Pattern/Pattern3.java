public class Pattern3
{
	public static void main(String[] args)
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=i; j++)
			{
			    if(i == 1 || i == 2)
			    {
			        System.out.print("*" );
			    }
			    else if(i % 2 != 0)
			   {
			    System.out.print("*");
			   } 
			}
			
			if (i == 1 || i == 2 || (i%2 != 0)) {
			    System.out.println();
			}
		}
	}
}