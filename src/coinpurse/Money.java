package coinpurse;

public class Money implements  Valuable  {

	protected double value;
	protected String currency;

	public Money(double value,String currency){
		super();
	}
	/**
	 * Return the value of coin
	 * @return value of coin
	 */
	public double getValue() { return value; }

	/**
	 * Return the currency of coin
	 * @return currency of coin
	 */
	public String getCurrency() { return currency; }
	
	   /**
		 * Compare the value of coins.
		 * @param coin
		 */
	   
	public int compareTo(Valuable o) { 
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