package mainPackage;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
	private static DataList dataList = new DataList();
	
	public static void menuView() {
		System.out.println(
				"----------------------\n" +
				"Hello there, Menu : \n" +
				"1. Add transaction \n" +
				"2. View Transactions History \n" +
				"3. View Balance \n" +
				"4. Exit \n" +
				"Type 1, 2, 3, 4 : ");
	}
	public static void historyTransactionsView() throws IOException {
		DataList dataList = new DataList();
		System.out.println("Transactions Histroy \n" 
							+ dataList.getData().toString() + 
							"\n-----------------------------\n" +
							"Type( 0 ) to return to menu");
	}
	public static void addTransaction(Scanner objScan) {
		objScan.nextLine();
		System.out.println("today date : (format : dd/mm/yy)");
		String date = objScan.nextLine();
		
		System.out.println("Description: (ex : beli ayam goweng)");
		String description = objScan.nextLine();
		
		System.out.println("(1) Expense / (2) Income : (ex : 2)");
		int type = objScan.nextInt();
		
		System.out.println("Balance : (ex : 12000)");
		double balance = objScan.nextDouble();
		
		System.out.println("-----------------------------\n" +
							"Type ( 0 ) to return to menu)");
		dataList.setData(date, type, balance, description);
		
	}
	public static void viewBalance(Scanner objScan) throws IOException {
		objScan.nextLine();
		System.out.println("Balance : " + dataList.getBalance());
		System.out.println("Type ( 0 ) to return to menu)");
	}
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		while(true) {
			if(input == 0) {
				menuView();
			}
			else if(input == 1) {
				addTransaction(scanner);
			}
			else if(input == 2) {
				historyTransactionsView();
			}
			else if(input == 3) {
				viewBalance(scanner);
			}
			else if(input == 4) {
				System.out.println("Thank You, Good Bye!!");
				break;
			}
			input = scanner.nextInt();
		}
	}	
}
