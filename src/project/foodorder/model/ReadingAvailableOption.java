package project.foodorder.model;

import java.io.Serializable;

public class ReadingAvailableOption implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int ID;
	private double price;
	private String details;
	
	public ReadingAvailableOption(int ID2, double price, String details) {
		this.ID = ID2;
		this.price = price;
		this.details = details;
	}
	
	public boolean hasID(int ID2 ) {
		return ID == ID2 ;
	}
	
	public void edit(double price2, String details2) {
		price = price2;
		details.replace(details, details2);
	}
	
	@Override
	public String toString() {
		return  ID +  " " + price + " " + details ;
	}

	
	
	
	
}
