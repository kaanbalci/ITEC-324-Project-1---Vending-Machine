/**
 * The Vending Machine Main
 * @author Kaan Balci
 */
public class VendMain 
{
	public static void main (String[] args)
	{
		VendingMachine machine = new VendingMachine();
		VendUI o = new VendUI(machine);
		o.selectOption();
		
	}
}
