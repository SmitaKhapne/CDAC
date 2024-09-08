package SandeepSir_Asiignment.Assignment_1;

import java.util.Scanner;

class TrackBmi
{
	int weight;
	float height;
	
	public void acceptRecord(Scanner sc)
	{
		System.out.println("enter weight");
		weight = sc.nextInt();
		
		System.out.println("enter height");
		height = sc.nextFloat();
		
	}
	
	public float calcBMI()
	{
		return weight / (height*height);
	}
	
	public String classifyBMI(float resBMI)
	{
		if(resBMI < 18.5)
		{
			return "Normal Weight";
		}
		else if (resBMI >= 18.5 && resBMI < 24.9)
		{
			return "underWeighted";
		}
		else if (resBMI >= 25 && resBMI < 29.9)
		{
			return "Overweight";
		}
		else
		{
			return "obese";
		}
	}
	
	public void printRecord(float resBMI,String printClassify)
	{
		System.out.println("BMI value: " + resBMI + ", Classification: "+printClassify);
	}
}


public class BMITracker {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		TrackBmi bmi = new TrackBmi();
		
		bmi.acceptRecord(sc);
		
		float resBMI = bmi.calcBMI();
		
		String printClassify = bmi.classifyBMI(resBMI);
		
		bmi.printRecord(resBMI, printClassify);
		sc.close();
		

	}

}
