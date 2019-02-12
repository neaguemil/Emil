package project.foodorder.model;
import java.io.Serializable;



public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	private	User user;
	private	AvailableOption option;
	private String status = "False";
	private double money = 00.00;


	public Order(User user, AvailableOption option, double money) {
	this.user = user;
	this.option = option;
	this.money = money;
	
	}
	
	public boolean hasOrderName(String name) {
		return user.hasName(name);
	}
	
	public boolean hasOrderUser(User user1) {
		return user.equals(user1);
	}
	
	public String toString() {
		return    user + "Order: " + option + "Status: " + status + " | " + " Paid: " + money ;
	}

	public void edit(String status2, double money2) {
			status = status2;
			money = money2;
	}

	public double getMoney() {
		return money;
	}
	
	public double getPrice() {
		return option.getPrice();
	}


	
	
	
}
