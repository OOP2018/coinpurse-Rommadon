package coinpurse;

import java.util.ArrayList;
import java.util.List;
/**
 * This class for sort the coins by the value.
 *
 */
public class MoneyUtil {
	/**
	 * the coins sort
	 * @param coins is the list of coin money in purse.
	 * @param currency is the currency of the coin.
	 * @return the list of coin .
	 */
	
	public static void main(String[] arg)
	{
		List<Coin> coins = new ArrayList<Coin>( );
		
		
		coins.add( new Coin(10.0, "Baht") );
		coins.add( new Coin(0.5, "Baht") );
		coins.add( new Coin(2.0, "Baht") ); 
		coins.add( new Coin(1.0, "Baht") );
		
		printCoins( coins ); 
		java.util.Collections.sort( coins );
		printCoins( coins );
		
	}
	
	/**
	 * show coin in purse
	 * @param List coin is all coin in purse
	 */
	
	public static void printCoins(List<Coin> coins){
		coins.forEach(System.out::println);
		
	}

}
