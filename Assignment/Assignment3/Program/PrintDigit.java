public class PrintDigit
{
	public static void main(String[] args)
	{
		int num = 9876;
		int sum = 0, temp = 0;
		
		while(num > 0)
		{
			temp = num % 10;
			sum = sum + temp;
			num = num / 10;
		}
		System.out.println("Sum of number : " + sum);
	}
}	