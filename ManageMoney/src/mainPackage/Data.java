package mainPackage;

import java.io.Serializable;
import java.util.ArrayList;

class Data implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private double balance;
	private static ArrayList<DataEntry> dataEntry;
	
	private void Data(Object data) {
		
	}
	public void readDataFile() {
		
	}
	public void newEntry(String name, Object dataEntry) {
		this.name = name;

	}
}
