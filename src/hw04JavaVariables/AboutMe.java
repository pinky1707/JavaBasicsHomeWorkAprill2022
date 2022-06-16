/*
 * Create a package name "hw4JavaVariables" inside the HW project. Create a Class name "AboutMe". Declare String and other 8 types of variable. Create a constructor and Give a sysout inside Constructor which will print "This is all about us: ". Then Create a method name aboutMe. Inside the method -use String and other 8 types of variables inside sysout to define a person's meaningful info. Create another class AboutMeTest. Instantiate AboutMe class under main method. Initialize variables and call the method by object. I expect print outcome for 2 person, one for you and another for your best friend Alex. give a single line comment where a variable is declared and initialized, constructor is declared and initialized, method is implemented and initialized. Follow indentation by Organizing the code and paste below. [Mark distribution (125) : using variable --10, Create a method and constructor - 20, instantiate class - 10, initialize variables and call methods for you and Alex= 20,  variable is declared and initialized, constructor is declared and initialized, method is implemented and initialized -- 15, organize code and other-- 30]. push your code to github -- 20. share the package link below.
 */
package hw04JavaVariables;

public class AboutMe {
	// variables declared
	public String name;
	public byte age;
	public short rent;
	public int salary;
	public long bank_balance;
	public float height;
	public double grade;
	public char sex;
	public boolean status;

	// Constructor declared
	public AboutMe() {
		System.out.println("\nThis is all about us: ");
	}

	// method implemented
	public void aboutMe() {
		System.out.println("My name is: " + name + "\nMy age:" + age + "\nMy house rent : " + rent + "\nMy salay is :"
				+ salary + "\nMy BankBalanc is :" + bank_balance + "\nMy height is :" + height + "\nMy grade is: "
				+ grade + "\nMy gender is :" + sex + "\nAm I Married? Ans: " + status);
	}

}
