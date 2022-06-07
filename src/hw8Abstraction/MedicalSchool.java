package hw8Abstraction;

public abstract class MedicalSchool {
//	method declared
//	this method is called abstract method

	public abstract void anatomyLab();

//	method implemented
//	this method is also called non abstract method
	public void biochemistry () {
		System.out.println("This is from non abstract method");

	}

	public MedicalSchool() { // default Constructor created

	}

}
