package coinpurse;
 
//TODO import List, ArrayList, and Collections
// You will use Collections.sort() to sort the coins

/**
 *  A coin purse contains coins.
 *  You can insert coins, withdraw money, check the balance,
 *  and check if the purse is full.
 *  
 *  @author your name
 */
public class Coin {
    /** Collection of objects in the purse. */
    //TODO declare a List of Coins named "money".
    
    /** Capacity is maximum number of items the purse can hold.
     *  Capacity is set when the purse is created and cannot be changed.
     */
    
    /** 
     *  Create a purse with a specified capacity.
     *  @param capacity is maximum number of coins you can put in purse.
     */
	Coin(double value,String currency){

    }

    /**
     * Count and return the number of coins in the purse.
     * This is the number of coins, not their value.
     * @return the number of coins in the purse
     */
    public double getValue( ){ return 0; }
    
    /** 
     *  Get the total value of all items in the purse.
     *  @return the total value of items in the purse.
     */
    public boolean equals(Object arg) {
		return false; 
	}

    
    /**
     * Return the capacity of the coin purse.
     * @return the capacity
     */
    //TODO write accessor method for capacity. Use Java naming convention.
    public int compareTo(Coin coin) { 
		return 0; 
	}

    public String toString() {
        //TODO complete this
    	return "you forgot to write Purse.toString()";
    }

}
//TODO When you finish, there should not be any TODO comments, including this one!
