package icici.loans.carloans;

public class Kotak 
{
	private int mainbalance = 1000;
	
	public int getMainbalance() 
	{
		System.out.println("Through kotak Bank : "+ mainbalance);
		return mainbalance;
	}

	public void setMainbalance(int mainbalance) 
	{
		this.mainbalance = mainbalance;
	}

	public static void main(String[] args) 
	{
		Kotak k = new Kotak();
		System.out.println("Through kotak Bank : "+k.mainbalance);
	}

}
