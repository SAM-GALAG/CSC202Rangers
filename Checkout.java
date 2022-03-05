package rangers1;

public class Checkout
{
	private int minA, maxA, minS, maxS, numC, timeNotUsed;
	
	public Checkout()
	{

	}

	public Checkout(int minArrival, int maxArrival, int minService, int maxService,
			int numCustomers, int notInUse)
	{
		minA = minArrival;
		maxA = maxArrival;
		minS = minService;
		maxS = maxService;
		numC = numCustomers;
		timeNotUsed = notInUse;
	}
	
	public int getMinA()
	{
		return minA;
	}
	
	public void setMinA(int num)
	{
		minA = num;
	}
	
	public int getMaxA()
	{
		return maxA;
	}
	
	public void setMaxA(int num)
	{
		maxA = num;
	}
	
	public int getMinS()
	{
		return minS;
	}
	
	public void setMinS(int num)
	{
		minS = num;
	}
	
	public int getMaxS()
	{
		return maxS;
	}
	
	public void setMaxS(int num)
	{
		maxS = num;
	}
	
	public int getNumC()
	{
		return numC;
	}
	
	public void setNumC(int num)
	{
		numC = num;
	}
	
	public int getTimeUnused()
	{
		return timeNotUsed;
	}
	
	public void setTimeUnused(int num)
	{
		timeNotUsed = num;
	}
}