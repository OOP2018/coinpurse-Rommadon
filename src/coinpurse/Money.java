package coinpurse;
/**
 *  
 *  Money represents value and currency.
 *  @author Rommadon Teedo 5810545025
 */
public class Money implements  Valuable  {

	protected double value;
	protected String currency;
	  /**
		 * Constructor for money with a value and currency
		 * @param value of the money
		 * @param currency of the money
		 */
	public Money(double value,String currency){
		this.value=value;
		this.currency=currency;
	}
	/**
	 * Return the value of money
	 * @return value of money
	 */
	public double getValue() { return value; }

	/**
	 * Return the currency of money
	 * @return currency of money
	 */
	public String getCurrency() { return currency; }
	
	   /**
		 * Compare the value of money.
		 * @param Valuable o is object valuable
		 */
	   
	public int compareTo(Valuable o) { 
	    	if(this.getCurrency().charAt(0) < o.getCurrency().charAt(0))
			{
				return -1;
			} else if(this.getCurrency().charAt(0) > o.getCurrency().charAt(0)){
				return 1;
			} else { 
				if(this.getValue()-o.getValue() <0)
					{
						return -1;
					} else if(this.getValue()-o.getValue() > 0){
						return 1;
					} else { 
						return 0;
					}
			}
			
		}
	/**
	 * Two money are equal if they have same value and currency.
	 */
	public boolean equals(Object arg) {
		if (arg == null) return false;
		if (arg.getClass() != this.getClass() )
			return false;
		Money other = (Money) arg;
		if ( currency.equalsIgnoreCase( other.currency ) && value==other.value )
			return true;
		return false; 
	}

}