package project.foodorder.model;
import java.io.Serializable;



public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
		User user;
		AvailableOption option;
	
	
	public Order(User user, AvailableOption option, boolean flag){
	this.user = user;
	this.option = option;
	}
	
	public boolean hasName(String user2) {
		return user.equals(user);
	}
	
	public String toString() {
		return   user + "Order: " + option;
	}
	
	
	
}
