/// Car ///

public abstract class Car {

	private String carID;
	private boolean isRented;

	public Car(String carID) {
		this.carID = carID;
		this.isRented = false;
	}

	public String getCarID() {
		return carID;
	}

	public boolean isRented() {
		return isRented;
	}

	public void rentCar() {
		isRented = true;
	}

	public void returnCar() {
		isRented = false;
	}

	@Override
	public String toString() {
		return carID + " - " + (isRented ? "Rented" : "Available");
	}
}


