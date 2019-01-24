package project.foodorder.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class PaymentStatsAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();
//	static boolean paid = false  ;
	
	public PaymentStatsAction() {
		super("3","Payment Status");
	}

	@Override
	public void doAction() {
//		System.out.println("payd or not...");
		boolean paiid = keyboard.getBoolean("True of false:");
		boolean paid = false;
			if(paiid = paid ) 
				System.out.println("Waiting to be paid");	
			else 
				System.out.println("Order paid !!");
	}

}
