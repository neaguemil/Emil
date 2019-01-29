package project.foodorder.actions;

import project.core.menu.MenuItem;
import project.foodorder.AplicationSession;
import project.foodorder.model.DataBase;
import project.foodorder.model.ReadingAvailableOption;

public class ViewOrderOptionAction extends MenuItem{
	
	public ViewOrderOptionAction() {
		super("3", "View Order Options");
	}
	
	public void doAction() {
		DataBase database = AplicationSession.getInstance().getDataBase();
		for(ReadingAvailableOption readingoption : database.getOptionReadings()) {
			System.out.println(readingoption);
		}
	}

	
	
}
