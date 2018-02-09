package coinpurse;

/**
 * An interface for value and currency.
 * 
 * @author Rommadon Teedo 5810545025
 */
public interface Valuable extends Comparable<Valuable>  {
	/**
	 * Get the value
	 * 
	 * @return value
	 */
	public double getValue();

	/**
	 * Get the currency
	 * 
	 * @return currency
	 */
	public String getCurrency();

}