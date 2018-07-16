/**
 * A class that handles the vending machine money transactions
 * 
 * @author Kaan Balci
 *
 */
public class VendMoney {
	int amount; //balance in machine
	int change; //change [kept in vending machine]
	
	/**
	 * Gets the current balance in the vending machine
	 * @return the amount currently stored in the vending machine
	 */
	public int getAmount(){
		return amount;
	}

	/**
	 * Adds a coin to the vending machine
	 */
	public void addCoin(){
		amount++;
		System.out.println("you have " + amount + " coins");
	}
	
	/**
	 * Empties the coins in the vending machine 
	 */
	public void removeCoins(){
		System.out.println("Change is " + amount);
		amount = 0;
	}
	
	/**
	 * Purchases an item and returns change
	 * @param item the item the user wants to purchase
	 */
	public void transaction(VendItem item){
		change = amount - item.getCost(); //gets the items cost
		System.out.println("your change is: " + change + " coins");
		amount = change; //vending machine keeps change as balance
	}

}