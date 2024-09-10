
package assignment_4.toll;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TollBoothRevenueUtil 
{
	public static void acceptRecord(Scanner sc, TollBoothRevenueManager obj)
	{
		System.out.println("enter number of cars");
		obj.setNoOfcars(sc.nextInt());
		
		System.out.println("enter number of truck");
		obj.setNoOfTruck(sc.nextInt());
		
		System.out.println("enter number of motorcycle");
		obj.setNoOfMotorcycle(sc.nextInt());
		
		System.out.println("enter toll rate of cars");
		obj.setCarTollRate(sc.nextFloat());
		
		System.out.println("enter toll rate of truck");
		obj.setTruckTollRate(sc.nextFloat());
		
		System.out.println("enter toll rate of motorcycle");
		obj.setMotorcycleTollRate(sc.nextFloat());
	}
	
	public static void printRecord(TollBoothRevenueManager obj)
	{
		NumberFormat nm = NumberFormat.getNumberInstance(new Locale("en", "IN"));
		System.out.println("number of vehicles pass the toll : "+ obj.totalNumberOfVehicles());
		System.out.println("total revenue collected : "+ nm.format(obj.clacTotalRevenue()));
	}
}
