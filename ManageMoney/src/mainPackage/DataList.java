package mainPackage;
import java.io.*;
import java.lang.*;
import java.util.*;

public class DataList {
	private static ArrayList<DataEntry> dataEntry;
	private static final String filePath = "C:\\Dev\\Java Project\\ManageMoney\\src\\mainPackage\\data.txt";
	
	DataList() {
		dataEntry = new ArrayList<DataEntry>();
		try {
			this.readObjectFile();
		} catch (ClassNotFoundException | IOException e) {
			
		}
	}
	private void writeObjectToFile(Object obj) {
		try {

			FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();

		} catch ( IOException e) {
			e.printStackTrace();
		}
	}
	private void readObjectFile() throws ClassNotFoundException, IOException {
		try {
			FileInputStream fis = new FileInputStream(filePath);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<DataEntry> result = (ArrayList<DataEntry>) ois.readObject();
			ois.close();
			dataEntry = result;
		}
		catch (ClassNotFoundException | IOException e) {
			dataEntry = new ArrayList<DataEntry>();
		}
	}
	
	public void setData(String date, int type, double balance, String Description) {
		DataEntry entry = new DataEntry(date, type, balance, Description);
		dataEntry.add(entry);
		writeObjectToFile(dataEntry);
	}
	public ArrayList<DataEntry> getData() throws IOException {
		try {
			readObjectFile();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return dataEntry;
	}
	public String getBalance() {
		double balance = 0;
		for(int i = 0; i < dataEntry.size(); i++) {
			if(dataEntry.get(i).getType() == "Income") {
				balance += dataEntry.get(i).getBalance();
				continue;
			}
			balance -= dataEntry.get(i).getBalance();
		}
		return String.format("%,.2f", balance);
	}
}
