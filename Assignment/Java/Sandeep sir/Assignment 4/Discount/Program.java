package assignment_4.discount;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DiscountCalculator obj = new DiscountCalculator();
		
		DiscountCalculatorUtil.acceptRecord(sc, obj);
		DiscountCalculatorUtil.printRecord(obj);
	}
	

}
