package assignment5;

public class Employee
{
	private static int numberOfEmployee;
	private static double totalSalaryExpense;
	
	private int empId;
	private String name;
	private double salary;
	
	Employee(int empId,String name,double salary)
	{
		numberOfEmployee++;
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		
		addToTotalSalaryExpense(salary);
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "empId=" + empId + ", name=" + name + ", salary=" + salary ;
	}
	
	
	public void applyRaise(double percentage)
	{
		double hike = salary * percentage/100;
		salary += hike;
		addToTotalSalaryExpense(hike);
	}
	
	public void updateSalary(double newSalary)
	{
		addToTotalSalaryExpense(newSalary - salary);
		salary = newSalary;
		
	}
	
	public void addToTotalSalaryExpense(double amount)
	{
		totalSalaryExpense += amount;
	}
	
	public static double getTotalSalaryExpense() {
		return totalSalaryExpense;
	}
	
	public static int getNumberOfEmployee() {
		return numberOfEmployee;
	}
	
}

