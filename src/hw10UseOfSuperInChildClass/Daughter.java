/*
 *b) create another class Daughter and declare variable birthMonth, age. Declare default (declare a sysout inside it) and parameterized constructor (declare a sysout inside it), and implement a regular method daughter() and declare a sysout. Create a parameterized method daughterInfo() which contains 2 of its variables as local variable. declare a sysout (you can copy from parameterized constructor) . Now, Daughter extends Father (super class). Use super method, super keyword and show all of their use in child class. Use 'FamilyName' variable (from parent class) to initialize by super keyword in child class (Use one constructor and one method to implement them). and initialize in a TestFamily Class. Paste GitHub link below.

 */

package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

//	default constructor
	public Daughter() {

		super();

		super.father();
		super.fatherInfo("Shambu Nath Sarker", 62, 'M', false);

		super.FamilyName = "Sarker";
		System.out.println("The Family name is : " + FamilyName);
		System.out.println("This is a default constructor'");
	}

	// parameterized constructor
	public Daughter(String birthMonth, int age) {
		super();
		super.father();
		super.fatherInfo("Anjoli Sarker", 58, 'F', false);
		super.FamilyName = "Sarker";
		System.out.println("The Family name is : " + FamilyName);

		this.birthMonth = birthMonth;
		this.age = age;
		System.out
				.println("Name : " + name + ",  Age :" + age + ", Gander:" + sex + ", Am I usCitizen?Ans:" + usCitizen);

	}

	public void daughter() {
		super.father();
		super.fatherInfo("Rinku Sarker", 36, 'F', true);
		super.FamilyName = "Sarker";
		System.out.println("The Family name is : " + FamilyName);
		System.out.println("This is a void type method from Daughter class");

	}

	// void type parameterized method
	public void daughter(String birthMonth, int age) {
		super.father();
		super.fatherInfo("Nayon Sarker", 28, 'M', true);
		super.FamilyName = "Sarker";
		System.out.println("The Family name is :" + FamilyName);
		System.out.println("This method is from void type parameterized method");
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("My Birth Month  : " + birthMonth + ",  Age :" + age);

	}

}
