package project.foodorder.model;
import java.io.Serializable;



import java.util.ArrayList;
import java.util.List;

import project.foodorder.AplicationSession;
import project.foodorder.actions.DeleteUserAction;
import project.foodorder.utils.Serializer;




public class FileDataBase implements DataBase, Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<ReadingUser> readusers = new ArrayList<ReadingUser>();

	@Override
	public List<ReadingUser> getUserReadings() {
		return readusers;
	}
	@Override
	public void addUser(ReadingUser readuser) {
		readusers.add(readuser);
		Serializer serializer = AplicationSession.getInstance().getSerialize();
		serializer.save(this);
	}
	
	@Override
	public ReadingUser getReadingByName(String name) {
		for ( ReadingUser readuser : readusers) {
			if(readuser.hasName(name)) {
				return readuser;
			}
		}		
		return null;
	}

	@Override
	public void editReadingUser(String name) {
		ReadingUser readuser = getReadingByName(name);
		readuser.edit(name);
		Serializer serializer =  AplicationSession.getInstance().getSerialize();
		serializer.save(this);
	}
	
	
	private List<ReadingAvailableOption> readoptions = new ArrayList<ReadingAvailableOption>();
	@Override
	public List<ReadingAvailableOption> getOptionReadings() {
		return readoptions;
	}
	

	@Override
	public void addOption(ReadingAvailableOption readoption) {
		
		Serializer serializer = AplicationSession.getInstance().getSerialize();
		serializer.save(this);		
	}

	@Override
	public ReadingAvailableOption getReadingByOptionID(int ID) {
		for (ReadingAvailableOption readoption : readoptions) {
			if(readoption.hasID(ID)) {
				return readoption;
			}
		}
		return null;

	}

	@Override
	public void editReadingOrderOption(int ID, String details, double price) {
		ReadingAvailableOption readoption = getReadingByOptionID(ID);
		readoption.edit(price, details);
		Serializer serializer = AplicationSession.getInstance().getSerialize();
		serializer.save(this);
	}
	@Override
	public void deleteReadingUser(String deletename) {
		ReadingUser readuser = getReadingByName(deletename);
		deletename.replace(deletename, " ");
		Serializer serializer =  AplicationSession.getInstance().getSerialize();
		serializer.save(this);
	}
	
	}

	





	


