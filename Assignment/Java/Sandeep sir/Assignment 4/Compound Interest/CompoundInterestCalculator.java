package assignment_4.compound_interest;

public class CompoundInterestCalculator {
	
	private double principal;
	private float interestRate;
	private int noOfTimesCompInYear;
	private int duration;
	
	public CompoundInterestCalculator() {
		
	}

	public CompoundInterestCalculator(double principal, float interestRate, int noOfTimesCompInYear, int duration) {
		super();
		this.principal = principal;
		this.interestRate = interestRate;
		this.noOfTimesCompInYear = noOfTimesCompInYear;
		this.duration = duration;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public int getNoOfTimesCompInYear() {
		return noOfTimesCompInYear;
	}

	public void setNoOfTimesCompInYear(int noOfTimesCompInYear) {
		this.noOfTimesCompInYear = noOfTimesCompInYear;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "CompoundInterestCalculator [principal=" + principal + ", interestRate=" + interestRate
				+ ", noOfTimesCompInYear=" + noOfTimesCompInYear + ", duration=" + duration + "]";
	}
	
	
	public double getCalculatedFutureValue() {
		return principal * Math.pow((1 + (interestRate/100)/noOfTimesCompInYear), (noOfTimesCompInYear * duration));
	}
	
	public double getCalculatedInterestEarned() {
		return getCalculatedFutureValue() - principal;
	}

}
