package project.foodorder.actions;

import project.core.menu.MenuItem;
import project.foodorder.AplicationSession;
import project.foodorder.model.DataBase;

public class DeleteOrderAction extends MenuItem {

	public DeleteOrderAction() {
		super("2","Delete Order");
		
	}

	@Override
	public void doAction() {
		DataBase db = AplicationSession.getInstance().getDataBase();
	
	}

}
