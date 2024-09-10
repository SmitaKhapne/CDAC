package assignment_4.discount;

public class DiscountCalculator 
{
	private float initialPrice;
	private float discount;
	
	
	public DiscountCalculator() 
	{
	}


	public DiscountCalculator(float initialPrice, float discount) 
	{
		this.initialPrice = initialPrice;
		this.discount = discount;
	}


	public float getInitialPrice() {
		return initialPrice;
	}


	public void setInitialPrice(float initialPrice) {
		this.initialPrice = initialPrice;
	}


	public float getDiscount() {
		return discount;
	}


	public void setDiscount(float discount) 
	{
		this.discount = discount;
	}
	
	@Override
	public String toString() 
	{
		return "DiscountCalculator [initialPrice=" + initialPrice + ", discount=" + discount + "]";
	}
	
	
	public float calcDiscount()
	{
		return initialPrice * (discount / 100);
	}
	
	public float clacFinalPrice()
	{
		return initialPrice - calcDiscount();
	}
}
