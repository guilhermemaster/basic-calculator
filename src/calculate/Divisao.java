package calculate;

public class Divisao {
	int valuePrime;
	int valueSecond;
	
	public int getValuePrime() {
		return valuePrime;
	}
	public void setValuePrime(int valuePrime) {
		this.valuePrime = valuePrime;
	}
	public int getValueSecond() {
		return valueSecond;
	}
	public void setValueSecond(int valueSecond) {
		this.valueSecond = valueSecond;
	}
	
	public int division()
	{
		return this.valuePrime / this.valueSecond;
	}

}
