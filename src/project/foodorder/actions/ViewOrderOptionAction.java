package project.foodorder.actions;

import project.core.menu.MenuItem;
import project.foodorder.AplicationSession;
import project.foodorder.model.DataBase;
import project.foodorder.model.AvailableOption;

public class ViewOrderOptionAction extends MenuItem{
	
	public ViewOrderOptionAction() {
		super("3", "View Order Options");
	}
	
	public void doAction() {
		DataBase database = AplicationSession.getInstance().getDataBase();
		for(AvailableOption option : database.getOption()) {
			System.out.println("------------------------------------------------------------------------------------------------------------");
			System.out.println(option);
		}
	}

	
	
}
