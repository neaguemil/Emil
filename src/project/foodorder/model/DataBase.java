
package project.foodorder.model;

import java.util.List;

public interface DataBase {
	
	List<User> getUser();
	
	void addUser(User user);
	User getReadingByName(String name);
	void editUser(String name, String newname);
	void deleteUser(String name);
	
	
	
	
	List<AvailableOption> getOption();
	
	void addOption(AvailableOption option);
	AvailableOption getReadingByOptionID(String id);
	void editOrderOption(String id, String details, double price);
	void deleteOption(String id);

	
	
	
	List<Order> getOrder();
	
	void deleteOrder(String name);
	void addOrder(Order order);
	Order getOrderByName(String name); 
	void editOrderStatus(String orderName, boolean status, double money);




	



	
	
	
	
	
	
	
	


	
	

	

	
}