package assignment5;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee(1, "Smita", 30000);
		Employee emp2 = new Employee(2, "Sunil", 50000);
		Employee emp3 = new Employee(3, "Kunal", 10000);
		
		emp1.applyRaise(10);
		System.out.println("Emp1 : " + emp1.toString());
		
		emp3.updateSalary(12000);
		System.out.println("Emp1 : " + emp3.toString());
		
		System.out.println("Count = " + Employee.getNumberOfEmployee());
		System.out.println("Total expense = " + Employee.getTotalSalaryExpense());
		
	}

}
