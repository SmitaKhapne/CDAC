package assignment_4.loan;

import java.util.Scanner;

public class LoanAmortizationUtil 
{
	public static void acceptRecord(Scanner sc, LoanCalculator ls)
	{
	
		System.out.println("enter principal");
		double principal = sc.nextInt();
		ls.setprincipal(principal);
		
		System.out.println("enter Interest Rate");
		float interestRate = sc.nextFloat();
		ls.setinterstRate(interestRate);
		
		System.out.println("enter loan term in year");
		int loantermInYear = sc.nextInt();
		ls.setloanTermInYear(loantermInYear);
	}
	
	public static void printRecord(LoanCalculator ls)
	{
		System.out.println("Monthly Payment = " + ls.monthlyPayment());
		System.out.println("total Payment paid = " + ls.monthlyPayment() * ls.calculateNumberOfLoanMoths());
	}
	
	
	public static void menuDrivenProgram(Scanner sc, LoanCalculator lc)
	{
		System.out.println("enter 1.accept Record");
		
		System.out.println("enter choice");
		int choice = sc.nextInt();
		
		while(choice != 0)
		{
			switch(choice)
			{
			    case 1: 
			    		acceptRecord(sc, lc);
			    		break;
			    case 2:
			    		printRecord(lc);
			    		break;
			    default:
			    	System.out.println("invalid input");
			}
			
			System.out.println("enter 0.exit  1.accept Record  2.print Record");
			System.out.println("enter choice");
			choice = sc.nextInt();  
		}
		
		
	}
	
	
}
