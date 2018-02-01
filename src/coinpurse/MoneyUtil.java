package coinpurse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		List<Valuable> m = new ArrayList<Valuable>();
		
		
		m.add( new Coin(10.0, "Baht") );
		m.add( new Coin(0.5, "Baht") );
		m.add( new Coin(2.0, "Baht") ); 
		m.add( new Coin(1.0, "Baht") );
		sortCoins(m);
		printCoins(m);
		System.out.println(filterByCurrency(m, "Baht"));

		
	
	}
	
	/**
	 * show coin in purse
	 * @param List coin is all coin in purse
	 */
	
	public static void printCoins(List<Valuable> coins){
		coins.forEach(System.out::println);
		
	}
	
	/**
	 * Find the coins are same currency and get the list.
	 * @param coins are coins in list.
	 * @param currency is currency of coins.
	 * @return the list of coins that have same currency.
	 */
	
	public static List<Valuable> filterByCurrency(List<Valuable> money, String currency){
			 		List<Valuable> coinF = new ArrayList<>();
			 		for(int i = 0; i < money.size(); i++){
			 			if(money.get(i).getCurrency().equals(currency)){
			 				coinF.add(money.get(i));
			}
		}
		return coinF;
	}
	
	/**
	 * Sort coins 
	 * @param coins are coins in list.
	 */
	public static void sortCoins(List<Valuable> coins){
			Comparator<Valuable> comp = new ValueComparator();
			java.util.Collections.sort(coins, comp);
		  	}
}
