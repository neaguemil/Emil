package project.foodorder.model;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;

	public User(String name) {
		this.name = name;
	}

	public boolean hasName(String name2) {
		return name.equals(name2);
	}

	public void edit(String newname) {
		this.name = newname;
	}

	@Override
	public String toString() {
		System.out.println("-----------------");
		return " | User: " + name + " | ";

	}

	public String getName() {
		return name;
	}
}
