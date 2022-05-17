package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		// Constructor initialized
		AboutMe pinky = new AboutMe();

		// variables initialized
		pinky.name = "Pinky Saha";
		pinky.age = 33;
		pinky.rent = 1235;
		pinky.salary = 123456789;
		pinky.bank_balance = 23456789067l;
		pinky.height = 5.2f;
		pinky.grade = 4.69;
		pinky.sex = 'F';
		pinky.status = true;
		// method initialized
		pinky.aboutMe();

		// constructor initialized
		AboutMe alex = new AboutMe();

		// variables initialized
		alex.name = "Alex";
		alex.age = 44;
		alex.rent = 3204;
		alex.salary = 204321;
		alex.bank_balance = 12344678l;
		alex.height = 5.9f;
		alex.grade = 3.30;
		alex.sex = 'M';
		alex.status = false;
		// method initialized
		alex.aboutMe();

	}

}
