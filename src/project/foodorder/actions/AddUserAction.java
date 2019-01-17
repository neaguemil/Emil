package project.foodorder.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class AddUserAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddUserAction() {
		super("1", "Add");
	}

	@Override
	public void doAction() {
		System.out.println("add user Action....");
//		int year = keyboard.getInt("Year: ");
//		int month = keyboard.getInt("Month: ");
//		int coldWater = keyboard.getInt("Cold water: ");
//		int hotWater = keyboard.getInt("Hot water: ");
		// do something with values
	}

}
