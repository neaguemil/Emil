package project.foodorder.actions;

import project.core.menu.MenuItem;
import project.foodorder.AplicationSession;
import project.foodorder.model.AvailableOption;
import project.foodorder.model.DataBase;
import project.foodorder.model.User;

public class ViewOrderAction extends MenuItem {

	public ViewOrderAction() {
		super("5", "View Order");
	}

	@Override
	public void doAction() {
		DataBase database = AplicationSession.getInstance().getDataBase();
		for(AvailableOption option : database.getOption()) {
			System.out.println(option);

//		System.out.println(" " + name1 + " " + " Option: " + option );
		
	}

}}
