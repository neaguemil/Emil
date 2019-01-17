package project.core.menu;

public class DeleteAction extends MenuItem {
	
	public DeleteAction(String key, String name) {
		super(key, name);
	}
	
	public void doAction() {
		System.out.println("Deleting...");
	}

}
