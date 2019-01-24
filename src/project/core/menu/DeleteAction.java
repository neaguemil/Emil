package project.core.menu;

import project.core.keyboard.Keyboard;

public class DeleteAction extends MenuItem {
	
	private static Keyboard instance = new Keyboard();
	
	public DeleteAction(String key, String name) {
		super(key, name);
	}
	
	public void doAction() {
		System.out.println("Deleting...");
		
	}
	
	

}
