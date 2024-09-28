/*6. Reverse Words in a String
Problem: Write a Java program to reverse the words in a given sentence.

Test Cases:

Input: "Hello World"
Output: "World Hello"
Input: "Java Programming"
Output: "Programming Java"
*/


import java.util.Scanner;

public class SentenceReversor 
{		
	public static void printReverse(String sentence)
	{
		String[] words = sentence.split(" ");
		for(int i=words.length-1; i>=0 ; i--)
		{
			System.out.print(words[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first sentence");
		String sentence1 = sc.nextLine();
		
		System.out.println("enter second sentence");
		String sentence2 = sc.nextLine();
		
		printReverse(sentence1);
		printReverse(sentence2);
	}

}



/*
ExPLAINATION:
1. Take a Sentence.
2. By using split(), split that sentence be space.
3. apply for loop in reverse manner and Print that.

*/