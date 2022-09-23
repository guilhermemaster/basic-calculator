package calculate;

public class Multiplicar {
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
	
	public int multiplication()
	{
		return this.valuePrime * this.valueSecond;
	}
}
