package coinpurse;

import java.awt.List;
import java.util.ArrayList;

public class MoneyUtil {
	
	public void sortCoins(){
		ArrayList<Coin> coins = new ArrayList<Coin>();
		coins.add( new Coin(10.0, "Baht") );
		coins.add( new Coin(0.5, "Baht") );
		coins.add( new Coin(1.0, "Baht") );
	 
		java.util.Collections.sort( coins );
		printCoins( coins ); 
		
	}
	
	public void printCoins(ArrayList<Coin> coins){
		coins.forEach(System.out::println);
		
	}

}
