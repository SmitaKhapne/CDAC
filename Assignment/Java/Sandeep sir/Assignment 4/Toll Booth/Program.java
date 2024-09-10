package assignment_4.toll;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TollBoothRevenueManager obj = new TollBoothRevenueManager();
		TollBoothRevenueUtil.acceptRecord(sc, obj);
		TollBoothRevenueUtil.printRecord(obj);
		sc.close();
	}

}
