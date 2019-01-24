
package project.foodorder.utils;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import project.foodorder.model.DataBase;
import project.foodorder.model.FileDataBase;

public class Serializer {
	private static final String FILE_DATABASE = "FoodOrderDB.ser";

	public void save(DataBase database) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_DATABASE));
			oos.writeObject(database);
			oos.close();
		} catch (IOException e) {
			System.out.println("Could not save database to file. " + e.getMessage());
			e.printStackTrace();
		}
	}

	public DataBase load() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(FILE_DATABASE)));
			DataBase db = (DataBase) ois.readObject();
			ois.close();
			return db;
		} catch (FileNotFoundException e) {
			System.out.println(
					"Database file does not exist. Probably you are running the application for the first time.");
			return new FileDataBase();
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("Could not load database file. " + e.getMessage());
			return null;
		}
	}
}
