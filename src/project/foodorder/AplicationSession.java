package project.foodorder;

import project.foodorder.model.DataBase;



import project.foodorder.model.FileDataBase;
import project.foodorder.utils.Serializer;


public class AplicationSession {

	private static AplicationSession instance = new AplicationSession();
	private DataBase database = new FileDataBase();
	private Serializer serializer = new Serializer();

	public static AplicationSession getInstance() {
		return instance;
	}

	public DataBase getDataBase() {
		return database;
	}

	public Serializer getSerialize() {
		return serializer;
		
	}

	public void setDataBase(DataBase database) {
		this.database = database;
	}
}


