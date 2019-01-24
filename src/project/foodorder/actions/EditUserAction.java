package project.foodorder.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.foodorder.AplicationSession;
import project.foodorder.model.DataBase;
import project.foodorder.model.ReadingUser;

public class EditUserAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();
	
	public EditUserAction() {
		super("4", "Edit");
	}

	@Override
	public void doAction() {
		DataBase db = AplicationSession.getInstance().getDataBase();
		String name = keyboard.getString("Name: ");
		
		ReadingUser  readusername = db.getReadingName(name);
		if( readusername == null) {
			System.out.println("User does not exist!!");
			return;
		}
		String  newname = keyboard.getString("New name: ");
		db.editReadingUser(newname);
	}

}
