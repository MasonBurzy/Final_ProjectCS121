/// Customer ///

import java.util.ArrayList;
import java.util.List;

private string userName;
private String PIN;
private String customerID;


public class Customer extends User implements HasMenu {

	public static void main(String[] args) {
		Customer customer = new Customer("user123", "1234");
		RentalSystem rentalSystem = new RentalSystem();
		customer.start(rentalSystem);	
	}

	public Customer(String userName, String PIN, String customerID) {
		this.userName = userName;
		this.PIN = PIN;
		this.customerID = customerID;
	}

	public void start() {
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

	public String menu() {
		System.out.println("\n0) Exit\n1) Rent a Car\n2) Return a Car\n3) Change PIN");
		String response = scanner.nextLine();
		System.out.println("You chose: " + response);
		return response;
	}

	
	public void rentCar(RentalSystem system, String carID) {
		Car car = system.findCarByID(carID);
		if (car != null && !car.isRented()) {
			car.setRented(true);
			System.out.println("Successfully rented car: " + carID);
		} else {
			System.out.println("Car is not available.");
		}
	}


	public void returnCar(RentalSystem system, String carID) {
		Car car = system.findCarByID(carID);
		if (car != null && car.isRented()) {
			car.setRented(false);
			System.out.println("Successfully returned car: " + carID);
		} else {
			System.out.println("Car is not currently rented.");
		}
	}

	public void changePIN(Scanner scanner) {
		System.out.println("Enter new PIN: ");
		String newPin = scanner.nextLine();
		setPin(newPin);
		System.out.println("PIN successfully changed.");
	}


