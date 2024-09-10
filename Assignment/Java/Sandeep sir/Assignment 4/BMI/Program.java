package assignment_4.bmi;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		BMITracker obj = new BMITracker();
		BmiTrackerUtil.menuList(sc, obj);
		
		sc.close();
	}

}
