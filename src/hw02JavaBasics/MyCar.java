/*
 * Create a package name "hw2JavaBasics" [create it by the help of header, not by right click of src file] inside the Homework project created before. Create a Class "MyCar" from the header (not by right click of package, this is the other way to create class). Under main method Please print ----> My name is <your name with double quotation>, I love to drive, My car info is below: . Use String concatenation feature for above outcome. Now use other syso to print your car each info (color, model, year, wheel drive [example:4WD] etc. [you can add more if you want]) in a separate line [try to follow how to copy and paste a line in IDE by key board command]. Use print instead of println for the car feature when print, use \n and \t at least once anywhere in the class. organize code at the end (very important),  After completing the code, paste it below.
 */
package hw02JavaBasics;
/*
 * I am sharing myself and my car feature 
 * In this project i am using concatenation feature
 * And also using print instead of println
 * using \n for new line, \t for tab
 * And after all use shift+ctrl+f for organize the code
 */

public class MyCar {
	public static void main(String[] args) {
		System.out.println("My name is \"Pinky Saha\", " + "I love to drive, " + "My car info is below: .");
		System.out.print("\tThe car color is gray, 2019 Toyota Rav4 Hybrid, \n\tAnd it's a \"All-Wheel drive\".");
		

	}
}