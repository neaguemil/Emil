package project.foodorder;

import project.core.menu.BackAction;



//import project.core.menu.DeleteAction;
import project.core.menu.Menu;
import project.core.menu.MenuItem;
import project.foodorder.actions.AddOptionAction;
import project.foodorder.actions.AddOrderAction;
import project.foodorder.actions.AddUserAction;
import project.foodorder.actions.DeleteOptionAction;
import project.foodorder.actions.DeleteOrderAction;
import project.foodorder.actions.DeleteUserAction;
import project.foodorder.actions.EditOrderOptionAction;
import project.foodorder.actions.EditUserAction;
import project.foodorder.actions.LeftToPayAction;
import project.foodorder.actions.PaymentStatsAction;
import project.foodorder.actions.ViewOrderOptionAction;
import project.foodorder.actions.ViewUserAction;
import project.foodorder.model.DataBase;
import project.foodorder.utils.Serializer;


public class Application  {
	public static void main(String[] args) {
		Application app = new Application();
		app.run();
	}
	
//	private void init() {
//		DataBase database = AplicationSession.getInstance().getDataBase();
//		database.addUser(new User("Andrei"));
//		database.addUser(new User("Alex"));
//	}

	private void run() {
		Serializer serializer = AplicationSession.getInstance().getSerialize();
		DataBase database = serializer.load();
		if (database == null) {
			return;
		}
		AplicationSession.getInstance().setDataBase(database);

		MenuItem mainMenu = createMenu();
		mainMenu.doAction();
	}

	private MenuItem createMenu() {
		MenuItem addUser = new AddUserAction();
		MenuItem addOption = new AddOptionAction();
		MenuItem addOrder = new AddOrderAction();
		MenuItem payStatus = new PaymentStatsAction();
		MenuItem leftToPay = new LeftToPayAction();
		MenuItem viewuser = new ViewUserAction();
		MenuItem editUser = new EditUserAction();
		MenuItem editorderoption = new EditOrderOptionAction();
		MenuItem viewoption = new ViewOrderOptionAction();
		MenuItem deleteuser = new DeleteUserAction();
		MenuItem deleteoption = new DeleteOptionAction();
		MenuItem deleteorder = new DeleteOrderAction();
		

		BackAction back = new BackAction("0", "Back");
		BackAction exit = new BackAction("0", "Exit");
//		DeleteAction delete = new DeleteAction("2", "Delete");

		Menu userMenu = new Menu("1", "Users Panel");
		userMenu.addItem(addUser);
		userMenu.addItem(deleteuser);
		userMenu.addItem(viewuser);
		userMenu.addItem(editUser);
		userMenu.addItem(back);
		userMenu.setBackAction(back);

		Menu optionsMenu = new Menu("2", "Options Management");
		optionsMenu.addItem(addOption);
		optionsMenu.addItem(deleteoption);
		optionsMenu.addItem(viewoption);
		optionsMenu.addItem(editorderoption);
		optionsMenu.addItem(back);
		optionsMenu.setBackAction(back);
		
		Menu orderMenu = new Menu("3", "Order Management");
		orderMenu.addItem(addOrder);
		orderMenu.addItem(deleteorder);
		orderMenu.addItem(viewoption);
		orderMenu.addItem(leftToPay);
		orderMenu.addItem(payStatus);
		orderMenu.addItem(back);
		orderMenu.setBackAction(back);
		

		Menu mainMenu = new Menu("", "Main");
		mainMenu.addItem(userMenu);
		mainMenu.addItem(optionsMenu);
		mainMenu.addItem(orderMenu);
		mainMenu.addItem(exit);
		mainMenu.setBackAction(exit);
		return mainMenu;
	}
}