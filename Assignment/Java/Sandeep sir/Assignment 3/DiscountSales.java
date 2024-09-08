package SandeepSir_Asiignment.Assignment_1;

import java.util.Scanner;

class DiscountCalculator
{
	float actualPrice;
	float discountRate;
	
	public void acceptRecord(Scanner sc)
	{
		System.out.println("enter actual price");
		actualPrice = sc.nextFloat();
		
		System.out.println("enter discount rate");
		discountRate = sc.nextFloat();
	}
	
	public float calculateDiscount()
	{
		return actualPrice * (discountRate / 100);
	}
	
	public float finalPrice(float discount)
	{
	   return actualPrice - discount;
	}
	
	public void displayRecord(float discount, float fp)
	{
		System.out.println("discount price = "+ discount);
		System.out.println("final price = "+ fp);
	}
}
public class DiscountSales
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		DiscountCalculator dc = new DiscountCalculator();
		
		dc.acceptRecord(sc);
		
		float discount = dc.calculateDiscount();
		
		float fp = dc.finalPrice(discount);
		dc.displayRecord(discount, fp);
		
		sc.close();
	}
}
