/// Customer ///

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Customer extends User {

	private String userName;
	private String PIN;
	private String customerID;


	public static void main(String[] args) {
		Customer customer = new Customer("user123", "1234", "cust1234");
		CarRental rentalSystem = new CarRental();
		customer.start(rentalSystem);	
	}

	public Customer(String userName, String PIN, String customerID) {
		this.userName = userName;
		this.PIN = PIN;
		this.customerID = customerID;
	}

	@Override
	public void start(CarRental system) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String response = menu(scanner);

			if (response.equals("0")) {
				break;
			} else if (response.equals("1")) {
				System.out.println("Enter Car ID to rent:");
				String carID = scanner.nextLine();
				rentCar(system, carID);
			} else if (response.equals("2")) {
				System.out.println("Enter Car ID to return:");
				String carID = scanner.nextLine();
				returnCar(system, carID);
			} else if (response.equals("3")) {
				changePIN(scanner);
			} else {
				System.out.println("Invalid choice, please try again.");
			}
		}
	}

	
	@Override
	public String menu(Scanner scanner) {
		System.out.println("\n0) Exit\n1) Rent a Car\n2) Return a Car\n3) Change PIN");
		String response = scanner.nextLine();
		System.out.println("You chose: " + response);
		return response;
	}

	
	public void rentCar(CarRental system, String carID) {
		Car car = system.findCarByID(carID);
		if (car != null && !car.isRented()) {
			car.rentCar();
			System.out.println("Successfully rented car: " + carID);
		} else {
			System.out.println("Car is not available.");
		}
	}


	public void returnCar(CarRental system, String carID) {
		Car car = system.findCarByID(carID);
		if (car != null && car.isRented()) {
			car.returnCar();
			System.out.println("Successfully returned car: " + carID);
		} else {
			System.out.println("Car is not currently rented.");
		}
	}

	public void changePIN(Scanner scanner) {
		System.out.println("Enter new PIN: ");
		String newPIN = scanner.nextLine();
		setPIN(newPIN);
		System.out.println("PIN successfully changed.");
	}

	public void setPIN(String newPIN) {
		this.PIN = newPIN;
	}

	@Override
	public void startSession(CarRental system) {
		start(system);
	}
}
