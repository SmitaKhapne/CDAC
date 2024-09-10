package assignment_4.bmi;

public class BMITracker 
{
	private float weight;
	private float height;
	
	public BMITracker()
	{
		
	}
	
	public BMITracker(float weight, float height)
	{
		this.weight = weight;
		this.height = height;
	}
	
	public float getWeight()
	{
		return weight;
	}
	
	public float getHeight()
	{
		return height;
	}
	
	public void setWeight(float weight)
	{
		this.weight=weight;
	}
	
	public void setHeight(float height)
	{
		this.height=height;
	}
	
	public String toString()
	{
		return "Weight : " + weight + "  height:" + height;
	}
	
	public float calcBMI()
	{
		return weight / (height * height);
	}
	
	public String classifyBmi()
	{
		float bmi = calcBMI();
		
		if(bmi < 18.5)
		{
			return "underweighted";
		}
		else if(bmi >= 18.5 && bmi < 24.9)
		{
			return "Normal weight";
		}
		else if(bmi >= 25 && bmi < 29.9)
		{
			return "Over weighted";
		}
		else
		{
			return "obese";
		}
		
	}
}

