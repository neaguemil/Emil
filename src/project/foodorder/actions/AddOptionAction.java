package project.foodorder.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class AddOptionAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();


	public AddOptionAction() {
		super("1", "Add");
	}

	@Override
	public void doAction() {
		System.out.println("add option...");		
	}

}
