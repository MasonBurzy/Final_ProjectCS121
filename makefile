
Car.class: Car.java
	javac -g Car.java

Admin.class: Admin.java User.class
	javac -g Admin.java	

Customer.class: Customer.java User.class Admin.class HasMenu.class
	javac -g Customer.java

User.class: User.java HasMenu.class
	javac -g User.java

CarRental.class: CarRental.java HasMenu.class
	javac -g CarRental.java

HasMenu.class: HasMenu.java
	javac -g HasMenu.java

testAdmin: Admin.class
	java Admin

testCustomer: Customer.class
	java Customer

testUser: User.class
	java User

run: CarRental.class
	java CarRental

clean:
	/ rm *.class
