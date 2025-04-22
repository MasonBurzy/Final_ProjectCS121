/// User ///

import java.util.Scanner;

public abstract class User implements HasMenu {

	private String userName = "";
	private String PIN = "";

	public boolean login(String userName, String PIN) {
		Scanner input = new Scanner(System.in);
		boolean result = false;
		System.out.println("User name: ");
		String userNameIn = input.nextLine();

		if (userNameIn.equals(this.userName)){
			System.out.println("PIN: ");
			String pinIn = input.nextLine();
			if (pinIn.equals(this.PIN)) {
				System.out.println("Login Successful");
				result = true;
			} else {
				System.out.println("Invalid PIN");
			} // end if
		} else {
			System.out.println("Invalid User Name");
		} // end if
		return result;
	} // end Login 

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setPIN(String PIN) {
		this.PIN = PIN;
	}

	public String getPIN() {
		return PIN;
	}

	public abstract void startSession(CarRental system);

}

