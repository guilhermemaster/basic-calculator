package calculate;

public class Subtracao {
	private int valuePrime;
	private int valueSecond;
	
	public int getValuePrime()
	{
		return valuePrime;
	}
	public void setValuePrime(int valuePrime)
	{
		this.valuePrime = valuePrime;
	}
	public int getValueSecond() 
	{
		return valueSecond;
	}
	public void setValueSecond(int valueSecond)
	{
		this.valueSecond = valueSecond;
	}
	
	public int subraction()
	{
		return this.valuePrime - this.valueSecond;
	}	
	
	
}
