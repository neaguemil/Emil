package project.foodorder.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class PaymentStatsAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();
	
	public PaymentStatsAction() {
		super("3","Payment Status");
	}

	@Override
	public void doAction() {
		System.out.println("payd or not...");
		
	}

}
