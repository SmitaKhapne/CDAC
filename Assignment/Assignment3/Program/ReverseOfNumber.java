public class ReverseOfNumber
{
	public static void main(String[] args)
	{
		int num = 1234;
		int temp=0;
		int rev=0;
		
		while(num > 0)
		{
			temp = num % 10;
			rev = rev * 10 + temp;
			num = num / 10;
		}
        System.out.println("Reverse of 1234 :" + rev);		
	}
}	