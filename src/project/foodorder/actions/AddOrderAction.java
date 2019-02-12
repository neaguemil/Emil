package project.foodorder.actions;

import project.core.keyboard.Keyboard;


import project.core.menu.MenuItem;
import project.foodorder.AplicationSession;
import project.foodorder.model.AvailableOption;
import project.foodorder.model.DataBase;
import project.foodorder.model.Order;
import project.foodorder.model.User;


public class AddOrderAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddOrderAction() {
		super("1", "Add Order");
	}

	@Override
	public void doAction() {
		DataBase db = AplicationSession.getInstance().getDataBase();
		String user = keyboard.getString("User Name: ");
		String option = keyboard.getString("Option ID: ");
		
		
		User username = db.getReadingByName(user);
		if(username == null) {
			System.out.println("User does not exist");
			return;
		}
		AvailableOption optionid = db.getReadingByOptionID(option);
		if(optionid == null) {
			System.out.println("Option does not exist");
			return;
		 }
		AvailableOption option1 = db.getReadingByOptionID(option);
		User user1 = db.getReadingByName(user);
		
		Order order = new Order(user1, option1, 0);
		AplicationSession.getInstance().getDataBase().addOrder(order);
	

	}

}
