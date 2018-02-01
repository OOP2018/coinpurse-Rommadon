package coinpurse;

import java.util.Comparator;

public class ValueComparator implements Comparator<Valuable>{
	public int compare(Valuable a, Valuable b) {
		if (a.getCurrency().equals(b.getCurrency())) {
			if (a.getValue() == b.getValue()){
				return 0;
			}
			if (a.getValue() > b.getValue()){
				return 1;
			}
			if (a.getValue() < b.getValue()){
				return -1;
			}
		}if(a.getCurrency().charAt(0) > b.getCurrency().charAt(0)){
			return 1;
		}else {
			return -1;
		
		}
	}

}
