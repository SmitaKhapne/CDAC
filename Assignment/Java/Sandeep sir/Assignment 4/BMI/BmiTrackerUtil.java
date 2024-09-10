package assignment_4.bmi;

import java.util.Scanner;

public class BmiTrackerUtil 
{
	public static void acceptRecord(Scanner sc, BMITracker obj)
	{
		System.out.println("enter weight");
		obj.setWeight(sc.nextFloat());
		
		System.out.println("enter height");
		obj.setHeight(sc.nextFloat());
	}
	
	public static void printRecord(BMITracker obj)
	{
		System.out.println("BMI calculated = " + obj.calcBMI());
		System.out.println("Classification = " + obj.classifyBmi());
	}
	
	public static void menuList(Scanner sc, BMITracker obj)
	{
		System.out.println("enter 1.acceptRecord ");
		int input = sc.nextInt();
		
		while(input != 0)
		{
			switch(input)
			{
			case 1:
					acceptRecord(sc, obj);
					break;
					
			case 2: 
					printRecord(obj);
					break;
			default:
				System.out.println("invalid input");
			}
			
			System.out.println("enter 1.acceptRecord 2.printRecord 0.exit");
			input = sc.nextInt();
		}
		
		System.out.println("close");
		
	}

}
