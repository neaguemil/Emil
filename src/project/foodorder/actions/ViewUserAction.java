package project.foodorder.actions;

import project.core.menu.MenuItem;


import project.foodorder.AplicationSession;
import project.foodorder.model.DataBase;
import project.foodorder.model.User;


public class ViewUserAction extends MenuItem {

	public ViewUserAction() {
		super("3", "View User ");
	}

	@Override
	public void doAction() {
		DataBase database = AplicationSession.getInstance().getDataBase();
		for (User users : database.getUser()) {
			System.out.println(users);
		
	}
	}	

}
