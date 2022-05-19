/*
 * Create a package name "hw5Q2Constructor" in your Home Work project. Inside the package, a) Create a class "Computer". Declare some variable -- brand, model, operating system, price, grade (grade as char) and madeInUSA. Declare default constructor and more than one parameterized constructor. Use only one System.out.println() in each constructor. b) Create another class ComputerTest. Create object from Computer class, as many as you want under main method. Initialize all the constructors. I want in console, the first outcome as -> This is from default Constructor of Computer class. Second outcome as-> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: $800, Grade: A and Made in USA? Ans: false. I want the third outcome in console for your configuration.  (Assume you are a Windows user even you are not). Organize your code. Push in the github. Paste your github link below.
 */

package hw5Q2Constructor;

	// variables declared
public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUsa;

	//default Constructor declared
	public Computer() {
		System.out.println("This is from default Constructor of Computer class ");

	}

	//parameterized Constructor declared
	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUsa) {

		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUsa = madeInUsa;

		System.out.println("My brand : " + brand + ", Model : " + model + ", Operating System: " + operatingSystem
				+ ", Price:" + price + ", Grade:" + grade + ", Made in USA? Ans:" + madeInUsa);
	}

	// parameterized Constructor declared
	public Computer(String brand, String model, int price, String operatingSystem, char grade, boolean madeInUsa) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUsa = madeInUsa;

		System.out.println("My Computer brand is: " + brand + ", Model is: " + model + ", Operating System is: "
				+ operatingSystem + ", Price :" + price + ", Grade:" + grade + ", Made in USA? Ans:" + madeInUsa);

	}

}
