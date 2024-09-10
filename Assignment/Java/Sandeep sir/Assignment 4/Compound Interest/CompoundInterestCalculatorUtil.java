package assignment_4.compound_interest;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CompoundInterestCalculatorUtil {
	
	public static void acceptRecord(Scanner sc, CompoundInterestCalculator obj) {
		
		System.out.println("Enter intial invested amt.");
		obj.setPrincipal(sc.nextDouble());
		
		System.out.println("Enter interest rate.");
		obj.setInterestRate(sc.nextFloat());
		
		System.out.println("Enter no of compounded terms in a year.");
		obj.setNoOfTimesCompInYear(sc.nextInt());
		
		System.out.println("Enter duration in year.");
		obj.setDuration(sc.nextInt());
		
	}
	
	public static void displayRecord(CompoundInterestCalculator obj) {
		Locale loc = new Locale("en", "IN");
		NumberFormat nm = NumberFormat.getNumberInstance(loc);
		
		System.out.println("Calculated future value = " + nm.format(obj.getCalculatedFutureValue()));
		System.out.println("Interest Earned = " + nm.format(obj.getCalculatedInterestEarned()));
	}
	
	
	public static void menuList(Scanner sc, CompoundInterestCalculator obj) {
		
		System.out.println("Enter 1. accept record");
		int input = sc.nextInt();
		
		while (input != 0) {
			
			switch (input) {
				case 1: acceptRecord(sc, obj);
						break;
				case 2: displayRecord(obj);
						break;
				default: System.out.println("Undefined input");
			}
			
			System.out.println("Enter 1. accept record, 2. display record, 0. exit");
			input = sc.nextInt();
		}
		
		System.out.println("closing the program");
	}

}
