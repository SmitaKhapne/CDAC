package assignment_4.loan;

import java.util.Scanner;

public class LoanAmortizationCalculator {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		LoanCalculator lc = new LoanCalculator();
		
		LoanAmortizationUtil.menuDrivenProgram(sc, lc);
		
		sc.close();
		
	}

}
