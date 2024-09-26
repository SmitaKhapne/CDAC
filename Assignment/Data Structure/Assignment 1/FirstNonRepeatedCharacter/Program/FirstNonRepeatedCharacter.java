/*8. First Non-Repeated Character
Problem: Write a Java program to find the first non-repeated character in a string.

Test Cases:

Input: "stress"
Output: 't'
Input: "aabbcc"
Output: null
*/
import java.util.Scanner;
public class NonRepeatedCharacter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] != arr[j])
				{
					System.out.println(arr[j]);
					System.exit(0);
					
				}
				else
				{
					System.out.println("null");
					System.exit(0);
				}
			}
		}			
	}
}