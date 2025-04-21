/// CarRental ///


public class CarRental implements HasMenu {

	private ArrayList cars;
	private ArrayList customers;
	private Customer lot;


	public CarRental() {
		this.cars = new ArrayList<>();
        	this.customers = new ArrayList<>();
        	this.lot = new Customer("Lot", "0000");
	}


	public void addCar(Car car) {
        	cars.add(car);
	}


	public boolean removeCar(String carID) {
		for (Car car : cars) {
			if (car.getCarID().equalsIgnoreCase(carID) && !car.isRented()) {
                		cars.remove(car);
                		return true;
			}
		}
		return false;
	}

	public void boolean rentCar() {
		for (Car car : cars) {
			if (car.getCarID().equalsIgnoreCase(carID) && !car.isRented()) {
                		car.rentTo(userID); // Rent the car to the user
                		return true;
			}
		}
		return false;
	}
	
	public void returnCar(String carID, String userID) {
		for (Car car : cars) {
			if (car.getCarID().equalsIgnoreCase(carID) && car.isRented() && car.getRentedTo().equals(userID)) {
                		car.returnCar(); // Return the car to the lot
                		return true;
			}
		}
		return false
	}

	public void main() {
	
	}

	public void loadCars() {
	
	}

	public void menu() {
	
	}

	public void start() {
	
	}

	public void startAdmin() {
	
	}

	public void addUser() {
	
	}

	public void loadCustomer() {
	
	}

	public void saveCustomer() {
	
	}


