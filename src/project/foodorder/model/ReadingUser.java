package project.foodorder.model;

import java.io.Serializable;

public class ReadingUser implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	
	
	

	public ReadingUser(String name) {
		this.name = name;
	}

	public boolean hasName(String name2) {
		return name.equals(name2) ;
	}

	public void edit(String name2) {
		name = name2;
	}

	public void replace(String name, String name2) {
		name.replace(name, " ");
		
		
	}
	
	@Override
	public String toString() {
		return "User: " + name;
	}



	

}
