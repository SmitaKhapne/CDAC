package SandeepSir_Asiignment.Assignment_1;

import java.util.Scanner;

class CalcCompound
{
	double initialInvestAmount;
	double anounalInterestRate;
	double numberOfCompound;
	int investYear;
	
	public void acceptRecord()
	{
		Scanner sc = new Scanner(System.in);
		
		initialInvestAmount = sc.nextDouble();
		anounalInterestRate = sc.nextDouble()/100;
		numberOfCompound = sc.nextDouble();
		investYear = sc.nextInt();
	}
	
	public double calculateFutureValue()
	{
		return initialInvestAmount * Math.pow((1 + anounalInterestRate / numberOfCompound),(numberOfCompound * investYear));
	}
	
	public double totalInterestEarned(double futureValue)
	{
		return futureValue - initialInvestAmount;
	}
	
	public void displayRecord(double futureValue, double totalEarning)
	{
		System.out.println("Future value= " +(float)futureValue);
		System.out.println("total earning= " +(float)totalEarning);
	}
	
}


public class CompoundInterestcalculator {

	public static void main(String[] args) 
	{
		CalcCompound cd = new CalcCompound();
		cd.acceptRecord();
		double futureValue = cd.calculateFutureValue();
		
		double totalEarning = cd.totalInterestEarned(futureValue);
		cd.displayRecord(futureValue, totalEarning);

	}

}
