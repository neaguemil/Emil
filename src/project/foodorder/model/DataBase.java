
package project.foodorder.model;

import java.util.List;

public interface DataBase {
	List<ReadingUser> getUserReadings();
	void addUser(ReadingUser reading);
	ReadingUser getReadingName(String name);
	void editReadingUser( String name);
	
	
	List<ReadingAvailableOption> getOptionReadings();
	void addOption(ReadingAvailableOption readoption);
	ReadingAvailableOption getReadingByOptionID(String ID);
	void editReadingOrderOption(String iD, String details, double price);
	
	
	
	
	


	
	

	

	
}