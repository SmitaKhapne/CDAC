public class Multiplier
{
	public static void main(String[] args)
	{
		int n = 7, mul=1;;
		for(int i=1; i<=100; i++)
		{
		   mul = n * i; 
		   if(mul <= 100)
		   {
		        System.out.println(mul);
		   }
		}
	}
}