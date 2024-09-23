
public class Accounts 
{
	// establishing the programs variables
	public double savingsBalance;
	public double checkingBalance;
	
	//establishing what makes Accounts
	public Accounts(double balanceC, double balanceS)
	{
		savingsBalance = balanceS;
		checkingBalance = balanceC;
	}
	
	//setting the savings value
	public void setSavings(double balanceS)
	{
		savingsBalance = balanceS;
	}
	
	//setting the checking value
	public void setChecking(double balanceC)
	{
		checkingBalance = balanceC;
	}
	
	//retrieving the savings value
	double getSavings()
	{
		return savingsBalance;
	}
	
	//retrieving the checking value
	double getChecking()
	{
		return checkingBalance;
	}
}
