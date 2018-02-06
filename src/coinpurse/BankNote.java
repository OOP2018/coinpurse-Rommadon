package coinpurse;

/**
 * 
 * Banknote represents value and currency and serialnumber.
 * 
 * @author Rommadon Teedo 5810545025
 */
public class BankNote implements Valuable {

	private double value;
	private String currency;
	private long serialNumber;
	private static long nextSerialNumber = 1000000;

	/**
	 * Constructor for banknote with a value and currency
	 * 
	 * @param value of the banknote
	 * @param currency of the banknote
	 * 
	 */
	public BankNote(double value, String currency) {
		this.value = value;
		this.currency = currency;
		this.serialNumber = nextSerialNumber++;
	}

	/**
	 * Return the value of banknote
	 * 
	 * @return value of banknote
	 */
	public double getValue() {
		return value;
	}

	/**
	 * Return the currency of banknote
	 * 
	 * @return currency of banknote
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * Return the serialNumber of banknote
	 * 
	 * @return serialNumber of banknote
	 */
	public long getSerial() {
		return serialNumber;
	}
	
	/**
	 * Checks object equal or not.
	 * @param arg is the object compare 
	 * @return true if equal false otherwise
	 */

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj.getClass() != this.getClass())
			return false;
		BankNote other = (BankNote) obj;
		return this.value == other.value && this.currency.equals(other.currency);
	}

	/**
	 * Returns a description of the banknote.
	 * 
	 * @return describe of the banknote
	 */
	public String toString() {
		return String.format("%.0f-%s note[%d]", value, currency, serialNumber);
	}

}
