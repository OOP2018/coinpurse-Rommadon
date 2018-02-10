package coinpurse;

/**
 * 
 * Banknote represents value and currency and serialnumber.
 * 
 * @author Rommadon Teedo 5810545025
 */
public class BankNote extends Money {

	private long serialNumber;
	private static long nextSerialNumber = 1000000;

	/**
	 * Constructor for banknote with a value and currency 
	 * 
	 * @param value
	 *            of the banknote
	 * @param currency
	 *            of the banknote
	 * 
	 */
	public BankNote(double value, String currency) {
		super(value, currency);
		this.serialNumber = nextSerialNumber++;
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
	 * Returns a description of the banknote.
	 * 
	 * @return describe of the banknote
	 */
	public String toString() {
		return String.format("%.0f-%s note[%d]", getValue(), getCurrency(), serialNumber);
	}

}
