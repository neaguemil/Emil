package project.foodorder.actions;

import project.core.keyboard.Keyboard;

import project.core.menu.MenuItem;
import project.foodorder.AplicationSession;
import project.foodorder.model.DataBase;
//import project.foodorder.model.DeleteUser;
import project.foodorder.model.User;

public class DeleteUserAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public DeleteUserAction() {
		super("2", "Delete User");	
	}

	public void doAction() {
		DataBase db = AplicationSession.getInstance().getDataBase();
		String name = keyboard.getString("Name for delete: ");
		User  deletename = db.getReadingByName(name);
		if( deletename == null) {
			System.out.println("User does not exist!!");
			return;
		}
		AplicationSession.getInstance().getDataBase().deleteUser(name);
	}	
	}











