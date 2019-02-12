package project.foodorder.actions;
import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.foodorder.AplicationSession;
import project.foodorder.model.AvailableOption;
import project.foodorder.model.DataBase;
import project.foodorder.model.Order;


public class LeftToPayAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	
	
	public LeftToPayAction(){
		super("4", "Left To Pay");
	}

	@Override
	public void doAction() {
		
		System.out.println("Left to pay..");
		DataBase db = AplicationSession.getInstance().getDataBase();
		String name = keyboard.getString("Name: ");
		
		Order order = db.getOrderByName(name);
		
				
		double lefttopay = order.getPrice() - order.getMoney();
		
		System.out.println( "Price:  " + order.getPrice() + "  |  " + "  Paid:  " + order.getMoney() + "  |  " + "  Left to Pay:  "  + lefttopay);

	

			}
	}
		
	
	
	


