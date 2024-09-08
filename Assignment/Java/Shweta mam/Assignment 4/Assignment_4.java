//Que: create a employee class and declare fields and method as per needed in employee class.

package Assignment_2;

import java.util.Scanner;

class EmployeeRecord
{
	private String name;                //fields(or instance variable)
	private int empID;
	private float salary;
	private int workExperience;
	
	public void acceptRecord()               //methods
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee name");
		name = sc.nextLine();
		
		System.out.println("enter employee ID");
		empID = sc.nextInt();
		
		System.out.println("enter employee Salary");
		salary = sc.nextFloat();
		
		System.out.println("enter employee how many year of work experience");
		workExperience = sc.nextInt();
		
		sc.close();
	}
	
	public void printRecord()
	{
		System.out.println("name:" + name);
		System.out.println("empID: " + empID);
		System.out.println("Salary :"+ salary );
		System.out.println("work experience: "+ workExperience);
	}
	
	
	
}
public class Assignment_4 
{
	public static void main(String[] args) 
	{
		EmployeeRecord emp1 = new EmployeeRecord();
		emp1.acceptRecord();
		emp1.printRecord();
		EmployeeRecord emp2 = new EmployeeRecord();
		emp2.acceptRecord();
		emp2.printRecord();

	}

}
