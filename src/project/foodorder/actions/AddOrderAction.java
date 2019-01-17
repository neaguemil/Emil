package project.foodorder.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class AddOrderAction extends MenuItem  {
	private Keyboard keyboard = Keyboard.getInstance();
	
	
	public AddOrderAction() {
		super("1", "Add");
	}




	@Override
	public void doAction() {
		System.out.println("add order...");
		
	}


}
