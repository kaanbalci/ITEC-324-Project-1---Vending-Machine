import java.util.ArrayList;
/**
 * A class that creates the Vending Machine
 * and populates it with the vending items
 * also defines methods for use with
 * respective actions of the Vending machine
 * @author Kaan Balci
 *
 */

//Contains items and vend money
public class VendingMachine {
	 
	ArrayList<VendItem> listItem = new ArrayList<VendItem>(); //create array list and object for
	private VendMoney mon = new VendMoney(); //object for vend money class
	
	/**
	 * Constructor to
	 * using the add method
	 * add items into the "Vending Machine"
	 *
	 */
	public VendingMachine()
	{
		VendItem one = new VendItem("Coke", 5, 2);
		listItem.add(one);
		VendItem two = new VendItem("Honey Bun", 8, 6);
		listItem.add(two);
		VendItem three = new VendItem("Water", 8, 3);
		listItem.add(three);
		VendItem four = new VendItem("Doritos", 2, 4);
		listItem.add(four);
		VendItem five = new VendItem("Big Red", 4, 1);
		listItem.add(five);
	}
	
	/**
	 * Used to list items 
	 * For loop increments to add each
	 * item to the print line until 
	 * array size is reached
	 *
	 *
	 */
	public void listItems()
	{
		for(int i = 0; i < listItem.size(); i++){
			System.out.println(i + 1 + ")\n" + listItem.get(i).toString());
		}
		
	}
	
	/**
	 * prints out the balance of coins 
	 * inside the vending machine
	 *
	 */
	public void balance(){
		System.out.println("Current Balance: " + mon.getAmount() + " coins");
	}
	/**
	 * calls removeCoins from VendMoney
	 * to empty coins in vending machine
	 */
	public void empty()
	{
		mon.removeCoins();
	}
	/**
	 * calls addCoin from 
	 * VendMoney to add a single
	 * coin to the Vending machine
	 */
	public void addCoin()
	{
		mon.addCoin();
	}
	/**
	 * Max Stock set to 8
	 * This is used to restock all items
	 * to the max.
	 */
	public void restock()
	{
		for(VendItem t:listItem)
		{
			t.restock();
		}
		System.out.println("All items fully stocked");
	}
	
	/**
	 * Select is used to take
	 * number selected, check for correct 
	 * amount of coins and if in stock
	 * calls transaction and dispense from
	 * VendItem 
	 * @param s
	 */
	public void select(int s)
	{
		if(s >= 1 & s <= listItem.size())
		{
			VendItem product = listItem.get(s-1);
			
			if (mon.getAmount() < product.getCost()){
				System.out.println("You dont have enough coins");
				mon.getAmount();
			}
			else if (product.getQuantity() == 0){
				System.out.println("out of stock");
				mon.getAmount();
			
			}else
			{ 
				mon.transaction(product);
				product.dispense();
			}
		}
	}
		
}