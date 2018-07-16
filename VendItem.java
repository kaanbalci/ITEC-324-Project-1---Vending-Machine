/**
 * A class that handles the Vending Items
 * 
 * @author Kaan Balci
 *
 */
public class VendItem {
	private String name;
	private int quantity;
	private int cost;
	private static final int STOCK = 8;
	/**
	 * Constructor
	 * @param n
	 * @param a
	 * @param c
	 */
	public VendItem(String n, int a, int c) {
		name = n;
		quantity = a;
		cost = c;

	}
	/**
	 * toString to
	 * @return Item, Cost, and quantity 
	 */
	public String toString() {
		return "Item: " + getName() + "   \nCost: " + getCost() + " Coins."
				+ "   \nQuantity: " + getQuantity() + " Available.";
	}
	/**
	 * getName made to
	 * @return name of item
	 */
	public String getName() {
		return name;
	}
	/**
	 * getQuantity made to 
	 * @return the stock
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * getCost made to
	 * @return the item cost
	 */
	public int getCost() {
		return cost;
	}
	/**
	 * sets the quantity of each item
	 * back to max capacity or 8
	 */
	public void restock() {
		quantity = STOCK;
	}
	/**
	 * made to dispense and subtract the 
	 * quantity of the item bought by 1
	 * prints message saying to enjoy "item"
	 */
	public void dispense() {
		quantity = quantity - 1;
		System.out.println("Enjoy your " + this.getName());
	}
}
