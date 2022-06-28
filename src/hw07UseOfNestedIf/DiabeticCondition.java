/*
 * Hemoglobin A1C is measured to determine - you are diabetic or not. Now, Create a package name --> "hw7UseOfNestedIf" inside your HW project. Create a Class, name "DiabeticCondition". Type the main method.  After the main method, print -- "<-- Please Enter your Hemoglobin A1C  value below -->". Instantiate Scanner class to type your Hemoglobin A1C  value in console. Declare a double type variable hbga1c and initialize it by scanner.nextDouble(). Now write some condition. a) If your hbga1c value is more than 6.4, outcome will be "I am diabetic"{". b) If your hbga1c value is not more than 6.4, Congratulation! you are not diabetic. now introduce the nested if condition for below. if hbga1c >= 5.7,  outcome will be "I am a pre-diabetic patient". if hbga1c < 5.7,  outcome will be "I am a healthy person". In the above conditions, use appropriate key word like if, else if, else to execute your health condition. Please organize the code. Any white space is not acceptable. push the code to GitHub and add the link below.
 
 */
package hw07UseOfNestedIf;

import java.util.Scanner;

public class DiabeticCondition {

	public static void main(String[] args) {
		System.out.println("<-- Please Enter your Hemoglobin A1C  value below -->");
		Scanner scanner = new Scanner(System.in);

		double hbga1c = scanner.nextDouble();

		if (hbga1c > 6.4) {
			System.out.println("I am a diabetic patient");
		} else {
			if (hbga1c >= 5.7) {
				System.out.println("I am a pre-diabetic patient");
			} else if (hbga1c < 5.7) {
				System.out.println("I am a Healthy person");
			}

			scanner.close();

		}
	}
}
