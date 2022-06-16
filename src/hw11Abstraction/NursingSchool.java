package hw11Abstraction;

public abstract class NursingSchool extends RockefellerUniversity {
//	method declared
//	also called abstract method
	public abstract void hygine();

//	method implemented here
//	this method is called non abstract method
	public void caring() {
		System.out.println("This is from non abstract method ");

	}

}
