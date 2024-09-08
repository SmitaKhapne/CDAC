package SandeepSir_Asiignment.Assignment_1;

import java.math.BigDecimal;
import java.util.Scanner;

class TollBoothRevenueManager
{
	int noOfCars;
	int noOfTrucks;
	int noOfMotorcycle;
	
	float carTollRate;
	float truckTollRate;
	float motorcycleTollRate;
	
	public void acceptRecord(Scanner sc)
	{
		System.out.println("enter number of cars");
		noOfCars = sc.nextInt();
		
		System.out.println("enter number of truck");
		noOfTrucks = sc.nextInt();
		
		System.out.println("enter number of motorcycle ");
		noOfMotorcycle = sc.nextInt();
		
		System.out.println("enter car toll rate");
		carTollRate = sc.nextFloat();
		
		System.out.println("enter truck toll rate");
		truckTollRate = sc.nextFloat();
		
		System.out.println("enter motorcycle toll rate");
		motorcycleTollRate = sc.nextFloat();
	}
	
	public float totalRevenue()
	{
		return (noOfCars*carTollRate) + (noOfTrucks*truckTollRate) + (noOfMotorcycle*motorcycleTollRate);
	}
	
	public void displayTotalRevenue(float printRevenue)
	{
		System.out.println("totoal revenue:" +printRevenue);
	}
	
}


public class TollBooth 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		TollBoothRevenueManager toll = new TollBoothRevenueManager();
		toll.acceptRecord(sc);
		
		float printRevenue= toll.totalRevenue();
		toll.displayTotalRevenue(printRevenue);
	}

}
