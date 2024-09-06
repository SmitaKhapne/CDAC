/*10. Arithmetic Operations with Command Line Input
Write a program that accepts two integers and an arithmetic operator (+, -, *, /) from the command line. Perform the specified arithmetic operation based on the operator provided. (Hint: Use switch-case for operations).
*/

package Assignment_2;

import java.util.Scanner;

public class Section_10
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 1st number");
		int a = sc.nextInt();
		
		System.out.println("enter 2nd number");
		int b = sc.nextInt();
		
		int result=0;
		
		System.out.println("enter number 1.addition 2.subtraction 3.multiplication 4.division");
		int num = sc.nextInt();
		switch(num)
		{
			case 1: result = a+b;
				break;
			case 2 : result = a-b;
				break;
			case 3: result = a*b;
				break;
			case 4: result = a/b;
				break;
			default:
				System.out.println("enter valid number");
		}
		
		System.out.println("Result :" +result);
				
				
	}
		
}


