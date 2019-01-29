package project.foodorder.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.foodorder.AplicationSession;
import project.foodorder.model.DataBase;
import project.foodorder.model.ReadingAvailableOption;

public class EditOrderOptionAction extends MenuItem {
	
	private Keyboard keyboard = Keyboard.getInstance();
	
	public EditOrderOptionAction() {
		super("4", "Edit Order Option");
	}
	
	public void doAction() {
		DataBase db = AplicationSession.getInstance().getDataBase();
		int ID = keyboard.getInt("ID: ");
		ReadingAvailableOption readoption = db.getReadingByOptionID(ID);
		if(readoption == null) {
			System.out.println("Order Option does not exist !!");
			return;
		}
		 String details = keyboard.getString("New Details: ");
		 double price = keyboard.getInt("New Price: ");
		 db.editReadingOrderOption(ID, details, price);
	}
}
