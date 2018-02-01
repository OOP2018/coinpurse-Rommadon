package coinpurse;
import java.util.Comparator;

/**
 * 
 * Compare value of money.
 * 
 * @author Rommadon Teedo 5810545025
 */

public class ValueComparator implements Comparator<Valuable> {
	 /**
		 * Compare the value of coins.
		 * @param a is Valuable money
		 * @param b is Valuable money
		 * @return 0 if equal 1 if a >b and -1 if a<b
		 */
	   
	public int compare(Valuable a, Valuable b) {
		if (a.getCurrency().equals(b.getCurrency())) {
			if (a.getValue() == b.getValue()) {
				return 0;
			}
			if (a.getValue() > b.getValue()) {
				return 1;
			}
			if (a.getValue() < b.getValue()) {
				return -1;
			}
		}
		if (a.getCurrency().charAt(0) > b.getCurrency().charAt(0)) {
			return 1;
		} else {
			return -1;

		}
	}

}
