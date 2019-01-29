
package project.foodorder.model;

import java.util.List;

public interface DataBase {
	List<ReadingUser> getUserReadings();
	
	void addUser(ReadingUser reading);
	ReadingUser getReadingByName(String name);
	void editReadingUser(String name);
	void deleteReadingUser(String deletename);
	
	
	
	
	List<ReadingAvailableOption> getOptionReadings();
	
	void addOption(ReadingAvailableOption readoption);
	ReadingAvailableOption getReadingByOptionID(int ID);
	void editReadingOrderOption(int ID, String details, double price);

	
	
	
	
	
	
	
	


	
	

	

	
}