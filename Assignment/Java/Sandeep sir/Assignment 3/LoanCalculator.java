package SandeepSir_Asiignment.Assignment_1;
import java.util.Scanner;

class Calculator
{
	float principalAmount;
	float rate;
	float loanTerm;
	
	public void acceptRecord(Scanner sc)
	{
		System.out.println("Enter principal amount");
		principalAmount = sc.nextFloat();
		
		System.out.println("Enter intrest rate");
		rate = sc.nextFloat();
		
		System.out.println("Enter year in yearTerm");
		loanTerm = sc.nextFloat();
	}
	
	public void printRecord()
	{
		System.out.println("principal amount:"+principalAmount);
		System.out.println("Interest Rate:"+rate);
		System.out.println("year:"+loanTerm);
	}
	
	public float monthlyInterestRate()
	{
		return (rate/12)/100;
	}
	
	public float calcMonthlyPayment(float monthlyPayment)
	{
		return (float)(principalAmount * (rate * Math.pow((1 + monthlyPayment),(loanTerm*12)) / Math.pow((1 + monthlyPayment),(loanTerm*12) - 1)));
	}
	
}
public class LoanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		
		Calculator c = new Calculator();
		
		c.acceptRecord(sc);
		
		float monthlyInterest = c.monthlyInterestRate();
		System.out.println("monthly Interest Rate:" + monthlyInterest);
		
		float payment = c.calcMonthlyPayment(monthlyInterest);
		System.out.println("monthly Interest Rate:" + payment);
		
		sc.close();
		
	}

}
