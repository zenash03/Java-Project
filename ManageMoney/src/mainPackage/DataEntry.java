package mainPackage;

import java.io.Serializable;

public class DataEntry implements Serializable {
	private static final long serialVersionUID = 1L;
	private String date;
	private int type;
	private double balance;
	private String description;
	
	DataEntry() {
		
	}
	
	DataEntry(String date, int type, double balance, String description) {
		this.date = date;
		this.type = type;
		this.balance = balance;
		this.description = description;
	}
	
	public void setItem(String date, int type, double balance, String description) {
		this.date = date;
		this.type = type;
		this.balance = balance;
		this.description = description;
	}
	
	public String getDate() {
		return this.date;
	}
	public String getType() {
		if(this.type == 1) {
			return "Expense";
		}
		return "Income";
	}
	public double getBalance() {
		return this.balance;
	}
	public String getDescription() {
		return this.description;
	}
	
	@Override 
	public String toString() {
		return "\nDate : " + this.date + "\nType : " 
				+ this.getType() + "\nBalance : " 
				+ String.format("%,.2f", this.balance) 
				+ "\nDescription : " 
				+ this.description + "\n";
	}
}
