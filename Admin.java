/// Admin ///


public class Admin extends Customer {
	
	public Admin(String userName, String pin, String customerID) {
		this.userName = userName;
		this.PIN = PIN;
		this.customerID = customerID;
	}


	public void start(RentalSystem system) {
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
			} else if (response.equals("4")) {
				addCar(system, scanner);
			} else if (response.equals("5")) {
				removeCar(system, scanner);
			} else {
				System.out.println("Invalid choice, please try again.");
			}
		}
	}


	public String menu(Scanner scanner) {
		System.out.println("\n0) Exit\n1) Rent a Car\n2) Return a Car\n3) Change PIN\n4) Add a Car\n5) Remove a Car");
		String response = scanner.nextLine();
		System.out.println("You chose: " + response);
		return response;
	}

	public void addCar(RentalSystem system, Scanner scannera) {
		System.out.println("Enter new Car ID:");
		String newCarID = scanner.nextLine();
		Car newCar = new Car(newCarID);
		system.addCar(newCar);
		System.out.println("Car added successfully: " + newCarID);
	}

	public void removeCar(RentalSystem system, Scanner scanner) {
		System.out.println("Enter Car ID to remove:");
		String carID = scanner.nextLine();
		boolean removed = system.removeCar(carID);

		if (removed) {
			System.out.println("Car removed successfully: " + carID);
		} else {
			System.out.println("Car ID not found or currently rented.");
		}
	}


