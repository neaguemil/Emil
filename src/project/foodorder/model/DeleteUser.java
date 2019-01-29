package project.foodorder.model;

import java.io.Serializable;

public class DeleteUser implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	public DeleteUser(String name) {
		this.name = name;
	}
	
	public void replace(String name, String name2) {
		name.replace(name, " ");		
	}
	
	public String toString() {
		return "User: " + name;
	}

}
