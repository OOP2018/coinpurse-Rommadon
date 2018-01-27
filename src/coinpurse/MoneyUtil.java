package coinpurse;

import java.util.ArrayList;
import java.util.Collections;
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
	
	/**
	 * Find the coins are same currency and get the list.
	 * @param coins are coins in list.
	 * @param currency is currency of coins.
	 * @return the list of coins that have same currency.
	 */
	public static List<Coin> filterByCurrency(List<Coin> coins, String currency) {
		List<Coin> sameCurrency = new ArrayList<>();
		for (Coin coin : coins) {
			if (coin.getCurrency().equals(currency)) {
				sameCurrency.add(coin);
			}
		}
		return sameCurrency;
	}
	
	/**
	 * Sort coins 
	 * @param coins are coins in list.
	 */
	public static void sortCoins(List<Coin> coins) {
		Collections.sort(coins);
	}

}
