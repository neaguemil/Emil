package project.foodorder.actions;

import java.util.Date;


import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.foodorder.AplicationSession;
import project.foodorder.model.AvailableOption;
import project.foodorder.model.DataBase;


public class AddOptionAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddOptionAction() {
		super("1", "Add");
	}

	@Override
	public void doAction() {
		String id = keyboard.getString("ID: ");
		Date data = keyboard.getDate("Data: ");
		String details = keyboard.getString("Details: ");
		double price = keyboard.getDouble("Price: ");


		AvailableOption option = new AvailableOption(id, price, details, data);
		AplicationSession.getInstance().getDataBase().addOption(option);
	}
	}

