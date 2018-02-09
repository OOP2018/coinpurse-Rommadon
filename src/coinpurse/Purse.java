package coinpurse;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



/**
 *  A valuable purse contains money.
 *  You can insert money, withdraw money, check the balance,
 *  and check if the purse is full.
 *  
 *  @author Rommadon Teedo 5810545025
 */
public class Purse {
	/** Collection of objects in the purse. */
	private List<Valuable> money= new ArrayList<Valuable>();;


	/** Capacity is maximum number of items the purse can hold.
	 *  Capacity is set when the purse is created and cannot be changed.
	 */
	private final int capacity;

	/** 
	 *  Create a purse with a specified capacity.
	 *  @param capacity is maximum number of money you can put in purse.
	 */
	public Purse( int capacity ) {
		this.capacity=capacity;
    	


	}

	/**
	 * Count and return the number of valuable in the purse.
	 * This is the number of money, not their value.
	 * @return the number of valuable in the purse
	 */
	public int count() { return money.size(); }

	/** 
	 *  Get the total value of all items in the purse.
	 *  @return the total value of items in the purse.
	 */
	public double getBalance() {
		double sum =0;
		for(int i =0;i<money.size();i++){
			sum += money.get(i).getValue();
		}
		return sum;

	}


	/**
	 * Return the capacity of the valuable purse.
	 * @return the capacity
	 */

	public int getCapacity() { 
		return capacity; 
	}

	/** 
	 *  Test whether the purse is full.
	 *  The purse is full if number of items in purse equals
	 *  or greater than the purse capacity.
	 *  @return true if purse is full.
	 */
	public boolean isFull() {
		if(money.size()>=capacity){
			return true;
		}else{
			return false;
		}
	}

	/** 
	 * Insert a valuable into the purse.
	 * The valuable is only inserted if the purse has space for it
	 * and the valuable has positive value.  No worthless money!
	 * @param valuable is a Coin object to insert into purse
	 * @return true if valuable inserted, false if can't insert
	 */
	 public boolean insert( Valuable valuable ) {
		if (!isFull()) {
			if (valuable.getValue() <= 0) {
				return false;
			} else {
				money.add(valuable);
				return true;
			}
		}
		return false;

	}

	/**  
	 *  Withdraw the requested amount of money.
	 *  Return an array of money withdrawn from purse,
	 *  or return null if cannot withdraw the amount requested.
	 *  @param amount is the amount to withdraw
	 *  @return array of valuable objects for money withdrawn, 
	 *    or null if cannot withdraw requested amount.
	 */
	public Valuable[] withdraw( double amount ) {

		double amountNeededToWithdraw = amount;

		if(amount<=0) {
			return null;
		}

		Comparator<Valuable> comp = new ValueComparator();
    	List<Valuable> list = new ArrayList<>();
    	Collections.sort(money, comp);
    	Collections.reverse(money);

		if(amountNeededToWithdraw!=0) {	
			if(amountNeededToWithdraw <= this.getBalance())
			{
				for (int i = 0; i < money.size(); i++)
				{
//					if(money.get(i).getCurrency().equalsIgnoreCase("Baht")) { 
//						
					
						if(amountNeededToWithdraw >= money.get(i).getValue())
						{
						amountNeededToWithdraw -= money.get(i).getValue();
						list.add(money.get(i));					
						}
//					}
				}
			}

			if(amountNeededToWithdraw==0)
			{
				for(Valuable removeCoin : list)
				{
					money.remove(removeCoin);
				}
			} else {	
				return null;
			}

			Valuable[] withdraw = new Valuable[list.size()];

	        return list.toArray(withdraw);
		}
		return null;
	}
	
	/**  
	 *  Withdraw the requested amount of money and currency.
	 *  Return an array of money withdrawn from purse,
	 *  or return null if cannot withdraw the amount requested.
	 *  @param amount is the amount to withdraw and currency
	 *  @return array of valuable objects for money withdrawn, 
	 *    or null if cannot withdraw requested amount.
	 */
	
	public Valuable[] withdraw( Valuable amount ) {

		double amountNeededToWithdraw = amount.getValue();
		
		if(amount.getValue()<=0) {
			return null;
		}

		Comparator<Valuable> comp = new ValueComparator();
    	List<Valuable> list = new ArrayList<>();
    	Collections.sort(money, comp);
    	Collections.reverse(money);

		if(amountNeededToWithdraw!=0) {	
			if(amountNeededToWithdraw <= this.getBalance())
			{
				for (int i = 0; i < money.size(); i++)
				{
					if(amount.getCurrency().equals(money.get(i).getCurrency())) { 
						if(amountNeededToWithdraw>= money.get(i).getValue())
						{
						amountNeededToWithdraw -= money.get(i).getValue();
						list.add(money.get(i));					
						}
					}
				}
			}

			if(amountNeededToWithdraw==0)
			{
				for(Valuable removeCoin : list)
				{
					money.remove(removeCoin);
				}
			} else {	
				return null;
			}

			Valuable[] withdraw = new Valuable[list.size()];

	        return list.toArray(withdraw);
		}
		return null;
	}

	/** 
	 * toString returns a string description of the purse contents.
	 * It can return whatever is a useful description.
	 */
	public String toString() {
		return "purse have " + this.count() + " valuable with balance " + this.getBalance();
	}

}

