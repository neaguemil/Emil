package project.foodorder.model;

import java.io.Serializable;

public class ReadingAvailableOption implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String ID;
	private double price;
	private String details;
	
	public ReadingAvailableOption(String ID, double price, String details) {
		this.ID = ID;
		this.price = price;
		this.details = details;
	}
	
	public boolean hasID(String ID2 ) {
		return ID == ID2 ;
	}
	
	public void edit(double price2, String details2) {
		price = price2;
		details = details2;
	}
	
	
	public String toString() {
		return  ID +  " " + price + " " + details ;
	}

	
	
	
	
}
