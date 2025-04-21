/// User ///

import java.io.*;

public abstract class User implements HasMenu {

	private String userName = "";
	private String PIN = "";

	public boolean login(userName, PIN) {
		scanner input = new Scanner(system.in);
		boolean result = false;
		System.out.println("User name: ");
		String userName = input.nextLine();

		if (userNameIn.equals(this.userName)){
			System.out.println("PIN: ");
			String pinIN = input.nextLine();
			if (pinIN.equals(this.PIN)) {
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

	public void setPIN(PIN) {
		this.PIN = PIN;
	}

	public String getPIN() {
		return PIN;
	}


