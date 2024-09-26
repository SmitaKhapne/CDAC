/*7. Find Repeated Characters in a String
Problem: Write a Java program to find all repeated characters in a string.

Test Cases:

Input: "programming"
Output: ['r', 'g', 'm']
Input: "hello"
Output: ['l']
*/
import java.util.Scanner;
public class RepeatedCharacterFinder
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String str = sc.nextLine();
			
		char[] charArr = str.toCharArray();
		
		for(int i=0; i<charArr.length; i++)
		{
			for(int j=i+1; j<charArr.length; j++)
			{
				if(charArr[i] == charArr[j])
				{
					System.out.println(charArr[i]);
					break;
					
				}
			}
		}
		
	}
}