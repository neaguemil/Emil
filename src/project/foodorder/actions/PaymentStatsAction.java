package project.foodorder.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.foodorder.AplicationSession;
import project.foodorder.model.DataBase;
import project.foodorder.model.Order;
import project.foodorder.model.User;

public class PaymentStatsAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();
	static boolean paid = false  ;
	
	public PaymentStatsAction() {
		super("5","Payment Status");
	}

	@Override
	public void doAction() {
		
		DataBase database = AplicationSession.getInstance().getDataBase();
		for (Order orders : database.getOrder()) {
			
//		System.out.println("payd or not...");
		boolean paid1 = keyboard.getBoolean("Paid or not:");
			if(paid = paid1) {
				System.out.println("Waiting to be paid");}	
			else {
				System.out.println("Order paid !!");
	}}}}

