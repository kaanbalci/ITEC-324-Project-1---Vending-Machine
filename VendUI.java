import java.util.Scanner;
/**
 * A class that handles the vending machine user interface
 * 
 * @author Kaan Balci
 *
 */
public class VendUI {
	private VendingMachine machine; //create object for vending machine 
	private Scanner in = new Scanner(System.in); //create object for scanner
	
	/**
	 * Constructor
	 * @param machine
	 */
	public VendUI(VendingMachine machine) {
		this.machine = machine;
	}
	/**
	 * Select option used to prompt user for input 
	 * on choice of operation
	 * 
	 */
	public void selectOption() {
		System.out.println("Welcome to Kaan's Vending Machine!");
		System.out.println("Please Select Option by choosing a letter.");

		while (true) {
			System.out.println("_Enter letter_  \nA. List Items \nB. Add One Coin \nC. Select Item \nD. Empty Coins \nE. Restock Items \nF. Balance \nG. Quit");
			try {
				char input = in.next().toUpperCase().charAt(0);

				if (input == 'A') {
					this.listItems();
				} else if (input == 'B') {
					this.addCoin();
				} else if (input == 'C') {
					this.itemSelect();
				} else if (input == 'D') {
					machine.empty();
				} else if (input == 'E') {
					machine.restock();
				} else if (input == 'F') {
					machine.balance();
				} else if (input == 'G') {
					System.out.println("Goodbye");
					System.exit(0);
				} else {
					System.out.println("invalid input");
				}
			} catch (java.io.IOException e) {
				System.out.println("error occurred");
			}

		}

	}
	/**
	 * user selects item based on
	 * number associated with the item
	 * 
	 */
	private void itemSelect() {
		System.out.println("Select an Item using the corresponding Item Number.");
		int vendNum = in.nextInt();
		machine.select(vendNum);
	}
	/**
	 * handles adding coin
	 * @throws java.io.IOException
	 */
	private void addCoin() throws java.io.IOException {
		machine.addCoin();
	}
	/**
	 * lists items in vending machine
	 */
	private void listItems() {
		machine.listItems();
	}

}