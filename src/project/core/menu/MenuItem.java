package project.core.menu;

public abstract class MenuItem {
	private String key;
	protected String name;
	
	public MenuItem(String key, String name) {
		super();
		this.name = name;
		this.key = key;
	}
	
	public abstract void doAction();
	
	@Override
	public String toString() {
		return key + ". " + name;
	}
	
	public boolean hasOption(String option) {
		return option.equals(key);
	}
	
	public String getKey() {
		return key;
	}

}
