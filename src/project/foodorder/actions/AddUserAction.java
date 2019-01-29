package project.foodorder.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.foodorder.AplicationSession;
import project.foodorder.model.ReadingUser;

public class AddUserAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddUserAction() {
		super("1", "Add User");
	}

	@Override
	public void doAction() {
		String name = keyboard.getString("New User Name: ");
		ReadingUser readuser = new ReadingUser(name);
		AplicationSession.getInstance().getDataBase().addUser(readuser);
	}

}
