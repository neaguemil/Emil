
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

	
//	void addOrder(User user, AvailableOption option);
	void deleteOrder(User user);
	void editOrder(User user, AvailableOption option);
	void addOrder(Order order);


	



	
	
	
	
	
	
	
	


	
	

	

	
}