package project.foodorder.actions;

import project.core.keyboard.Keyboard;

import project.core.menu.MenuItem;
import project.foodorder.AplicationSession;
import project.foodorder.model.AvailableOption;
import project.foodorder.model.DataBase;

public class DeleteOptionAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public DeleteOptionAction() {
		super("2", "Delete Option");	
	}
	
	public void doAction() {
		DataBase db = AplicationSession.getInstance().getDataBase();
		String id = keyboard.getString("ID option to delete: ");
		AvailableOption  deleteoption = db.getReadingByOptionID(id);
		if( deleteoption == null) {
			System.out.println("Option does not exist!!");
			return;
		}
		AplicationSession.getInstance().getDataBase().deleteOption(id);
	}	
	}











