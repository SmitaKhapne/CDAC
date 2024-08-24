public class LargeNumberFinder
{
	public static void main(String[] args)
	{
		int num = 4825, temp = 0;
		int large = 0;
		
		while(num > 0)
		{
			temp = num % 10;
			
			if(temp > large)
			{
				large = temp;
			}
			num = num / 10;
		}
		System.out.println("large number : " + large);
	}
}