package assignment_4.loan;

public class LoanCalculator 
{
	double principal;
	float interestRate;
	int loanTermInYear;
	
	public LoanCalculator()
	{
		
	}
	
	public LoanCalculator(double principal,float interestRate,int loanTermInYear)
	{
		this.principal=principal;
		this.interestRate = interestRate;
		this.loanTermInYear = loanTermInYear;
	}
	
	public void setprincipal(double principal)
	{
		this.principal = principal;
	}
	public void setinterstRate(float interestRate2)
	{
		this.interestRate = interestRate2;
	}
	public void setloanTermInYear(int loanTermInYear)
	{
		this.loanTermInYear = loanTermInYear;
	}
	
	public double getprincipal()
	{
		return this.principal;
	}
	public float getinterestRate()
	{
		return this.interestRate;
	}
	public int getLoanTermInYear()
	{
		return this.loanTermInYear;
	}
	
	public String toString()
	{
		return "principal : " + this.principal + "loan term : " + this.interestRate + "loan term in year : " + this.loanTermInYear;
	}
	
	public double calcMothlyInterest()
	{
		return (interestRate / 12) / 100;
	}
	
	public int calculateNumberOfLoanMoths()
	{
		return loanTermInYear * 12;
	}
	
	public double monthlyPayment()
	{
		return principal * (calcMothlyInterest() * Math.pow(1 + calcMothlyInterest(), calculateNumberOfLoanMoths())) 
				/ (Math.pow(1 + calcMothlyInterest(), calculateNumberOfLoanMoths()) - 1);
	}

}
