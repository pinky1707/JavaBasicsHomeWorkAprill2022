package hw11Abstraction;

//public abstract class MedicalSchool extends RockefellerUniversity {
//abstract can not inherit a regular class by using "extends" keywords
//public abstract class MedicalSchool extends College {here College is an Interface
//abstract class can not inherit an Interface by "extends" keywords
//public abstract class MedicalSchool extends NursingSchool { 
//abstract class can inherit one abstract class by "extends" keywords
/*
 * In Java 2 keywords(extends,implement) are used in an abstract class for inheritance
 * implements keyword is used to inherit Interface in abstract class
// an abstract class can inherit more than one Interface
// an abstract class cannot inherit a regular class or abstract class by implements keyword

 */
public abstract class MedicalSchool extends NursingSchool implements LawSchool {
//	method declared
//	this method is called abstract method

	public abstract void anatomyLab();

//	method implemented
//	this method is also called non abstract method
	public void biochemistry() {
		System.out.println("This is from non abstract method");

	}
	public static void medicalSchool() {
		System.out.println("This is a static method from MedicalSchool");
		
	}

	public MedicalSchool() { // default Constructor created

	}

}
