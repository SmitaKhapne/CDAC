package javaprogram;

import java.util.Scanner;

public class BodyMassIndex 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter weight in kg");
		int weight = sc.nextInt();
		
		System.out.println("enter height in meter");
		float height = sc.nextFloat();
		
		float BMI = weight / (height*height);
		
		if(BMI < 18.5)
		{
			System.out.println("under-weighted");
		}
		else if(BMI >= 18.5 && BMI < 24.9)
		{
			System.out.println("normal weight");
		}
		else
		{
			System.out.println("over-weighted");
		}
	}
}
