package project.foodorder.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.foodorder.AplicationSession;
import project.foodorder.model.DataBase;
import project.foodorder.model.Order;

public class DeleteOrderAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public DeleteOrderAction() {
		super("2","Delete Order");
		
	}

	@Override
	public void doAction() {
		DataBase db = AplicationSession.getInstance().getDataBase();
		String name = keyboard.getString("Order name: ");
		Order deleteorder = db.getOrderByName(name);
		if(deleteorder == null) {
			System.out.println("Order does not exist");
			return;
		}
		AplicationSession.getInstance().getDataBase().deleteOrder(name);
	}

}
