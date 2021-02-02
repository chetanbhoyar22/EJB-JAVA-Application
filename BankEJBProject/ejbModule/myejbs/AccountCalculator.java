package myejbs;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class AccountCalculator
 */
@Stateless(mappedName = "ac")
@LocalBean
public class AccountCalculator implements AccountCalculatorLocal {

    /**
     * Default constructor. 
     */
    public AccountCalculator() {
        // TODO Auto-generated constructor stub
    }

    public double calcInterest(String actype,double amount)
    {
    	double interest=0.0;
    	
    	if(actype.equals("saving"))
    		interest=amount*3/100;
    	
    	if(actype.equals("fixed"))
    		interest=amount*7/100;
    	
    	if(actype.equals("current"))
    		interest=amount*4/100;
    	
    	return(interest);
    }
}
