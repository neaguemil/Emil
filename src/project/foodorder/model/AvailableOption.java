package project.foodorder.model;

import java.io.Serializable;

import java.util.Date;

public class AvailableOption implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private double price;
	private String details;
	private Date data;

	
	
	public AvailableOption(String id, double price, String details, Date data) {
		this.id = id;
		this.price = price;
		this.details = details;
		this.data = data;
		
	}
	
	public boolean hasID(String id2 ) {
		return id.equals(id2) ;
	}
	
	public void edit(double price2, String details2) {
		price = price2;
		details = details2;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		
		return  "|    " + "ID: " + id + "    |    " +  " Details: " + details + "    |    " + " Price: " + price + "    |    " + " Data: " + data + "    |";
	}

	public String getOption() {
		return "|    " + "ID: " + id + "    |    " +  " Details: " + details + "    |    " + " Price: " + price + "    |    " + " Data: " + data + "    |";
	}
	
}
