package assignment_4.toll;

public class TollBoothRevenueManager 
{
	private int noOfcars;
	private int noOfTruck;
	private int noOfMotorcycle;
	private float carTollRate;
	private float truckTollRate;
	private float motorcycleTollRate;
	public TollBoothRevenueManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TollBoothRevenueManager(int noOfcars, int noOfTruck, int noOfMotorcycle, float carTollRate,
			float truckTollRate, float motorcycleTollRate) {
		super();
		this.noOfcars = noOfcars;
		this.noOfTruck = noOfTruck;
		this.noOfMotorcycle = noOfMotorcycle;
		this.carTollRate = carTollRate;
		this.truckTollRate = truckTollRate;
		this.motorcycleTollRate = motorcycleTollRate;
	}
	public int getNoOfcars() {
		return noOfcars;
	}
	public void setNoOfcars(int noOfcars) {
		this.noOfcars = noOfcars;
	}
	public int getNoOfTruck() {
		return noOfTruck;
	}
	public void setNoOfTruck(int noOfTruck) {
		this.noOfTruck = noOfTruck;
	}
	public int getNoOfMotorcycle() {
		return noOfMotorcycle;
	}
	public void setNoOfMotorcycle(int noOfMotorcycle) {
		this.noOfMotorcycle = noOfMotorcycle;
	}
	public float getCarTollRate() {
		return carTollRate;
	}
	public void setCarTollRate(float carTollRate) {
		this.carTollRate = carTollRate;
	}
	public float getTruckTollRate() {
		return truckTollRate;
	}
	public void setTruckTollRate(float truckTollRate) {
		this.truckTollRate = truckTollRate;
	}
	public float getMotorcycleTollRate() {
		return motorcycleTollRate;
	}
	public void setMotorcycleTollRate(float motorcycleTollRate) {
		this.motorcycleTollRate = motorcycleTollRate;
	}
	@Override
	public String toString() {
		return "TollBoothRevenueManager [noOfcars=" + noOfcars + ", noOfTruck=" + noOfTruck + ", noOfMotorcycle="
				+ noOfMotorcycle + ", carTollRate=" + carTollRate + ", truckTollRate=" + truckTollRate
				+ ", motorcycleTollRate=" + motorcycleTollRate + "]";
	}
	
	public float clacTotalRevenue()
	{
		return (noOfcars * carTollRate) + (noOfTruck * truckTollRate) + (noOfMotorcycle * motorcycleTollRate);
	}
	
	public int totalNumberOfVehicles()
	{
		return noOfcars + noOfMotorcycle + noOfTruck;
	}

}
