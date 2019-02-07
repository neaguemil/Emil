package project.foodorder.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.foodorder.AplicationSession;
import project.foodorder.model.DataBase;
import project.foodorder.model.Order;


public class EditPaymentStatusAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();
	
	
	public EditPaymentStatusAction() {
		super("5","Change Payment Status");
	}

	@Override
	public void doAction() {
		DataBase db = AplicationSession.getInstance().getDataBase();
		String name = keyboard.getString("Order Name: ");
		Order order = db.getOrderByName(name);
		
		if(order == null) {
			System.out.println("Order does not exist !!");
			return;
		}
		 boolean status = keyboard.getBoolean("New Status: ");
		 if(status = true) {
		 double money = keyboard.getDouble("Money: ");
		 db.editOrderStatus(name, status, money);
	}
	}
	

}

