package assignment5;

class InstancePrint
{
	private static int count=0;
	
	InstancePrint()
	{
		count++;
	}
	public static void printRecord()
	{
		System.out.println("count= " + count);
	}
}


public class InstanceCounter {

	public static void main(String[] args) 
	{
		InstancePrint ins1 = new InstancePrint();
		InstancePrint ins2 = new InstancePrint();
		InstancePrint ins3 = new InstancePrint();
		
		InstancePrint.printRecord();
	}
}
