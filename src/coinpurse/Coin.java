package coinpurse;
 /**
 *  
 *  Coin represents value and currency.
 *  @author Rommadon Teedo 5810545025
 */
public class Coin extends Money {
    /**
	 * Constructor for coin with a value and currency
	 * @param value of the coin
	 * @param currency of the coin
	 */
	Coin(double value,String currency){
	
		super(value,currency);
		
    }

	/**
	 * Two coin are equal if they have same value and currency.
	 */
    public boolean equals(Object arg) {
    	if (arg == null) return false;
		if (arg.getClass() != this.getClass() )
			return false;
		Coin other = (Coin) arg;
		if ( currency.equalsIgnoreCase( other.currency ) && value==other.value )
			return true;
		return false; 
	}

//    /**
//	 * Compare the value of coins.
//	 * @param coin
//	 */
//   
//    public int compareTo(Coin coin) { 
//    	if(this.getValue()-coin.getValue() <0)
//		{
//			return -1;
//		} else if(this.getValue()-coin.getValue() > 0){
//			return 1;
//		} else { 
//			return 0;
//		}
//		
//	}
    /**
	 * show value and currency
	 * @return the sentence value and currency.
	 */
    public String toString() {
       
    	return value + " " + currency;
    }

}

