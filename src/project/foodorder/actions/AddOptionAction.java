package project.foodorder.actions;
import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.foodorder.AplicationSession;
import project.foodorder.model.ReadingAvailableOption;

public class AddOptionAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();


	public AddOptionAction() {
		super("1", "Add");
	}

	@Override
	public void doAction() {
		int ID = keyboard.getInt("ID: ");
		String details = keyboard.getString("Details: ");	
		int price = keyboard.getInt("Price: ");
		
		
		ReadingAvailableOption readoption = new ReadingAvailableOption(ID, price, details);
		AplicationSession.getInstance().getDataBase().addOption(readoption);
	}

}
