package project.foodorder;

import project.core.menu.BackAction;
import project.core.menu.DeleteAction;
import project.core.menu.Menu;
import project.core.menu.MenuItem;
import project.foodorder.actions.AddOptionAction;
import project.foodorder.actions.AddOrderAction;
import project.foodorder.actions.AddUserAction;
import project.foodorder.actions.LeftToPay;
import project.foodorder.actions.PaymentStatsAction;



public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		app.run();
	}

	private void run() {
		MenuItem mainMenu = createMenu();
		mainMenu.doAction();
	}

	private MenuItem createMenu() {
		MenuItem addUser = new AddUserAction();
		MenuItem addOption = new AddOptionAction();
		MenuItem addOrder = new AddOrderAction();
		MenuItem payStatus = new PaymentStatsAction();
		MenuItem leftToPay = new LeftToPay();
		

		BackAction back = new BackAction("0", "Back");
		BackAction exit = new BackAction("0", "Exit");
		DeleteAction delete = new DeleteAction("2", "Delete");

		Menu usersMenu = new Menu("1", "Users Panel");
		usersMenu.addItem(addUser);
		usersMenu.addItem(delete);
		usersMenu.addItem(back);
		usersMenu.setBackAction(back);

		Menu optionsMenu = new Menu("2", "Options Management");
		optionsMenu.addItem(addOption);
		optionsMenu.addItem(delete);
		optionsMenu.addItem(back);
		optionsMenu.setBackAction(back);
		
		Menu orderMenu = new Menu("3", "Order Management");
		orderMenu.addItem(addOrder);
		orderMenu.addItem(delete);
		orderMenu.addItem(payStatus);
		orderMenu.addItem(leftToPay);
		orderMenu.addItem(back);
		orderMenu.setBackAction(back);
		

		Menu mainMenu = new Menu("", "Main");
		mainMenu.addItem(usersMenu);
		mainMenu.addItem(optionsMenu);
		mainMenu.addItem(orderMenu);
		mainMenu.addItem(exit);
		mainMenu.setBackAction(exit);
		return mainMenu;
	}
}
