package coinpurse;

/**
 * 
 * Banknote represents value and currency.
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
	 * @param value
	 *            of the coin
	 * @param currency
	 *            of the coin
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
		 * Two serialNumber are equal if they have same value and currency.
		 */

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj.getClass() != this.getClass())
			return false;
		BankNote other = (BankNote) obj;
		return this.value == other.value && this.currency == other.currency;
	}

	 /**
		 * show value and currency
		 * @return the sentence value and currency.
		 */
	public String toString() {
		return String.format("%.0f-%s note[%d]", value, currency, serialNumber);
	}

}
