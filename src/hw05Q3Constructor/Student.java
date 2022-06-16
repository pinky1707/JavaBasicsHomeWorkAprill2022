/*
 * Create a package name "hw5Q3Constructor" in your Home Work project. Inside the package, a) Create a class "Student". Declare some variable -- stName, stID, sex, isProgrammer(as boolean), grade (as float). Declare default constructor and only one parameterized constructor (use select variables--right click--source to create it). Use only one System.out.println() in parameterized constructor to declare the above variables. Create another class StudentTest. Create object as many as you want under the main method. Initialize constructors. I want the first outcome in the console as --> This is from default Constructor of Student class. in the next line, The second outcome -- > Student Name: <your name>, ID: <your id>, Sex: <your sex in char>, Grade: <your grade> and Java Programmer? Ans: true. Organize the code. Push in the github. Paste your github link below.
 */

package hw05Q3Constructor;

public class Student {
	// variables declared
	public String stName;
	public int stID;
	public float grade;
	public char sex;
	public boolean isProgrammer;

	// default Constructor declared
	public Student() {
		System.out.println("This is from default Constructor of Student class.");

	}

	// parameterized Constructor declared
	public Student(String stName, int stID, float grade, char sex, boolean isProgrammer) {
		this.stName = stName;
		this.stID = stID;
		this.grade = grade;
		this.sex = sex;
		this.isProgrammer = isProgrammer;

		System.out.println("Student name: " + stName + ", ID: " + stID + ", Sex: " + sex + ", Grade: " + grade
				+ ", Java Programmer? Ans: " + isProgrammer);
	}

}
