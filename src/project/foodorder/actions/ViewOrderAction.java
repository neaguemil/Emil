package project.foodorder.actions;

import project.core.menu.MenuItem;

import project.foodorder.AplicationSession;
import project.foodorder.model.DataBase;
import project.foodorder.model.Order;


public class ViewOrderAction extends MenuItem {

	public ViewOrderAction() {
		super("6", "View Order");
	}

	@Override
	public void doAction() {
		DataBase database = AplicationSession.getInstance().getDataBase();
		for(Order order : database.getOrder()) {
			System.out.println(order);
	
	}

}}
