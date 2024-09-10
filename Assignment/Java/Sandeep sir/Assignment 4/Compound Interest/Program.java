package assignment_4.compound_interest;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		CompoundInterestCalculator obj = new CompoundInterestCalculator();
		
		CompoundInterestCalculatorUtil.menuList(sc, obj);
		
		sc.close();

	}

}
