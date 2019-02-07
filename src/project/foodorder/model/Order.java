package project.foodorder.model;
import java.io.Serializable;



public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	private	User user;
	private	AvailableOption option;
	private boolean status;
	private double money = 00.00;

	public Order(User user, AvailableOption option, boolean status, double money) {
	this.user = user;
	this.option = option;
	this.money = money;
	this.status = status;
	}
	
	public boolean hasOrderName(String name) {
		return user.equals(user);
	}
	
	public String toString() {
		return   user + "Order: " + option + "Status: " + status + " | " + " Paid: " + money ;
	}

	public void edit(boolean status2, double money2) {
			status = status2;
			money = money2;
	}
	
	
	
}
