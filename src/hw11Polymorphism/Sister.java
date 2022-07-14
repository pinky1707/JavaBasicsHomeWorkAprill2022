/*
 * Create a package "hw11Polymorphism" inside your HW project and execute the remaining. Read the question very carefully. Create a class Sister. Can you create several methods with the same name (sister) inside it with the help of below variables?  As a variable, use int age1, int age2, int age3, String age4, int age5, int age6 etc in different combination. Use void type, parameterized type, return type, static type, final type method by different combinations of the above variable. Tell me what is the Method overloading by multiple line comments.  initialize all the methods in TestFamily class. Create another class Niece and inherit (extends) Sister. Override all the possible methods by changing logic. If some methods are not possible to override, please explain why by the multiple line comments comments. Tell me what is the Method overriding by multiple line comments. Initialize all the methods of Niece class in TestFamily class.

 */

package hw11Polymorphism;

public class Sister {
//	void type parameterized method 01 implemented
	public void sister(int age1, int age2, int age3, int age5, int age6) {
		System.out.println("This is from void type parameterized method");

	}
//	return type parameterized method 02 implemented
//	method overloading here

	public int sister(int age1, int age2, int age3) {
		int total1 = age1 + age2 + age3;
		System.out.println("The total age from sister:" + total1);
		return total1;

	}
//	return type parameterized method 03 implemented
//	method overloaded

	public int sister(int age1, int age2, int age3, String age4) {
		int total2 = age1 + age2 + age3 + Integer.parseInt(age4);
		System.out.println("The total age from sister:" + total2);
		return total2;

	}
//	return type parameterized method 04 implemented
//	method overloaded here

	public int sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total3 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("The total age from sister:" + total3);
		return total3;

	}

//	static type method 05 implemented
//	method overloaded here
	public static int sister(int age1, int age3, String age4, int age5, int age6, int age2) {

		int total2 = age1 + age3 + Integer.parseInt(age4) + age5 + age6 + age2;
		System.out.println("The total age from sister:" + total2);
		return total2;
	}

//	final type method 06 implemented
	public final int sister(int age1, int age2, int age3, int age5) {
		int total3 = age1 + age2 + age3 + age5;
		System.out.println("The total age from sister:" + total3);
		return total3;
	}

//	void type method 07 implemented
	public void sister() {
		System.out.println("This is from void type method from sister");

	}

}
