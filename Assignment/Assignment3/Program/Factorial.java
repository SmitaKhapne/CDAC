public class Factorial
{
   
	static int isFactorial(int num)
	{
		if(num == 0)
		{
			return 1;
		}
    return num * isFactorial(num - 1);
			
	} 
	
	public static void main(String[] args)
	{
		int num = 10;
	
		System.out.println("factorial of 10 is : " + isFactorial(num));
  
	} 
	
	
}