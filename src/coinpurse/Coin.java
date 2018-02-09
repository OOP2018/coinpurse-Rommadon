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
	 * show value and currency
	 * @return the sentence value and currency.
	 */
    public String toString() {
       
    	return getValue() + " " + getCurrency();
    }

}

