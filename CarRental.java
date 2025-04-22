/// CarRental ///

import java.util.ArrayList;
import java.util.Scanner;


public class CarRental implements HasMenu {

	private ArrayList<Car> cars;
	private ArrayList<Customer> customers;
	private Customer lot;


	public static void main(String[] args) {
                CarRental system = new CarRental();
                system.start();
	}

	public CarRental() {
		this.cars = new ArrayList<>();
        	this.customers = new ArrayList<>();
        	this.lot = new Customer("Lot", "0000", "Lot");
	}

	public void addCar(Car car) {
        	cars.add(car);
	}

	public boolean removeCar(String carID) {
		for (Car car : cars) {
			if (car.getCarID().equals(carID)) {
                		cars.remove(car);
                		return true;
			}
		}
		return false;
	}

	public boolean rentCar(String carID, String userID) {
		for (Car car : cars) {
			if (car.getCarID().equals(carID) && car.isRented()) {
                		car.returnCar();
                		return true;
			}
		}
		return false;
	}
	
	public boolean returnCar(String carID, String userID) {
		for (Car car : cars) {
			if (car.getCarID().equals(carID) && car.isRented()) {
                		car.returnCar();
                		return true;
			}
		}
		return false;
	}


	public void displayAvailableCars() {
		System.out.println("Available Cars:");
		for (Car car : cars) {
			if (!car.isRented()) {
                		System.out.println("- " + car.getCarID() + ": " + car.toString());
			}
		}
	}


	public boolean isCarAvailable(String carID) {
		for (Car car : cars) {
			if (car.getCarID().equals(carID) && !car.isRented()) {
				return true;
			}
		}
		return false;
	}


	public ArrayList<Car> getAllCars() {
        	return cars;
	}


	public Car findCarByID(String carID) {
        	for (Car car : cars) {
            		if (car.getCarID().equals(carID)) {
                		return car;
			}
		}
        	return null;
	}

	public boolean isCustomerRegistered(String userID) {
        	for (Customer customer : customers) {
            		if (customer.getUserName().equals(userID)) {
                		return true;
			}
		}
        	return false;
	}

	
	public User findUser(String userName, String PIN) {
		for (Customer customer : customers) {
			if (customer.getUserName().equals(userName) && customer.getPIN().equals(PIN)) {
                		return customer;
			}
		}
		return null;
	}

	public String menu() {
		Scanner scanner = new Scanner(System.in)
		System.out.println("Welcome to the Car Rental System!");
		System.out.println("0) Exit System\n 1) Login as Customer\n 2) Login as Admin");
		String response = scanner.nextLine();
		System.out.println("You selected: " + response);
		return response;
	}

	public void start() {
		while (true) {
			String response = menu();

			if (response.equals("0")) {
				return;
				break;
			} else if (response.equals("1")) {
				System.out.println("Action: Login as Customer");
				loginAsCustomer();
			} else if (response.equals("2")) {
				System.out.println("Action: Login as Admin");
				loginAsAdmin();
			} else {
				System.out.println("Invalid choice, please try again.");
			}
		}
	}
}}
