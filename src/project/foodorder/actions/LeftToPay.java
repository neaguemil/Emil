package project.foodorder.actions;

import project.core.menu.MenuItem;

public class LeftToPay extends MenuItem {
	public LeftToPay(){
		super("4", "Left To Pay");
	}

	@Override
	public void doAction() {
		System.out.println("Left to pay..");
		
	}
	
	

}
