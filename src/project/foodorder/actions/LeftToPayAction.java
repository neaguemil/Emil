package project.foodorder.actions;
import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class LeftToPayAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	
	
	public LeftToPayAction(){
		super("4", "Left To Pay");
	}

	@Override
	public void doAction() {
		
		System.out.println("Left to pay..");

			}
	}
		
	
	
	


