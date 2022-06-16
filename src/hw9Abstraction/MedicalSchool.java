package hw9Abstraction;

//public abstract class MedicalSchool extends RockefellerUniversity {
//abstract can not inherit a regular class by using "extends" keywords
//public abstract class MedicalSchool extends College {here College is an Interface
//abstract class can not inherit an Interface by "extends" keywords
//public abstract class MedicalSchool extends NursingSchool { 
//abstract class can inherit one abstract class by "extends" keywords
public abstract class MedicalSchool {
//	method declared
//	this method is called abstract method

	public abstract void anatomyLab();

//	method implemented
//	this method is also called non abstract method
	public void biochemistry() {
		System.out.println("This is from non abstract method");

	}

	public MedicalSchool() { // default Constructor created

	}
	

}
