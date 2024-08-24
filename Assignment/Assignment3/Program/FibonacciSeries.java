public class FibonacciSeries
{
	public static void main(String[] args)
	{
		int n1 = 0, n2 = 1, n3 = 0;
		System.out.println(n1);
		System.out.println(n2);
		n3 = n1 + n2;
		while(n3 <= 21)
		{
			System.out.println(n3 );
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
		}
	}
}	