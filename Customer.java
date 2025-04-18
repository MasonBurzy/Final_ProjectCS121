/// Customer ///

import java.util.ArrayList;
import java.util.List;

private string userName;
private String PIN;
private String customerID;


public class Customer extends User implements HasMenu {

	public static void main(String[] args) {
		Customer customer = new Customer("user123", "1234");
		customer.start();	
	}

	public Customer(String userName, String PIN, String customerID) {
		this.userName = userName;
		this.PIN = PIN;
		this.customerID = customerID;
	}

	public void start() {

	}

	public String menu() {
	
	}

	public void changePIN() {
	
	}


