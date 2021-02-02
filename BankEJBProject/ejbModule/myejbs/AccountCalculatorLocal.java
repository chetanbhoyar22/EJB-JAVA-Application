package myejbs;

import javax.ejb.Local;

@Local
public interface AccountCalculatorLocal 
{
	public double calcInterest(String actype,double amount);

}
