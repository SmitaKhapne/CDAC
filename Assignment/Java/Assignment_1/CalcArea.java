//Write a program that allows the user to select a shape (Circle, Square, Rectangle, Triangle)
//and then calculates the area based on user-provided dimensions using a switch case.


package javaprogram;

import java.util.Scanner;

public class CalcArea 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number for 1.circle 2.square 3.rectanhle 4.triangle");
		int shape = sc.nextInt();
		
		switch(shape)
		{
			case 1:
				System.out.println("enter a radius");
				int r = sc.nextInt();
				
				float circle_area = (float)3.14 * r * r;
				System.out.println("Area of Circle is : "+ circle_area);
				break;
			case 2:
				System.out.println("enter Side");
				float side = sc.nextFloat();
				
				float square_area = (float)side * side;
				System.out.println("Area of Circle is : "+ square_area);
				break;
			case 3:
				System.out.println("enter a width");
				int w = sc.nextInt();
				
				System.out.println("enter a height");
				int h = sc.nextInt();
				
				float rectangle_area = (float)w * h;
				System.out.println("Area of Circle is : "+ rectangle_area);
				break;
				
			case 4:
				System.out.println("enter a base");
				int base = sc.nextInt();
			
				System.out.println("enter a height");
				int height = sc.nextInt();
			
				float triangle_area = (float)1/2 * base * height;
				System.out.println("Area of Circle is : "+ triangle_area);
				break;
			
		}
	}

}
