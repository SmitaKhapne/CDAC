package assignment_4.discount;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class DiscountCalculatorUtil 
{
	public static void acceptRecord(Scanner sc, DiscountCalculator obj)
	{
		System.out.println("enter initial price");
		obj.setInitialPrice(sc.nextFloat());
		
		System.out.println("enter discount value");
		obj.setDiscount(sc.nextFloat());
		
	}
	
	public static void printRecord(DiscountCalculator obj)
	{
		NumberFormat nm = NumberFormat.getNumberInstance(new Locale("en", "IN"));
		System.out.println("discount= " +nm.format(obj.calcDiscount()));
		System.out.println("fianl price = "+ nm.format(obj.clacFinalPrice()));
	}
	
	

}
