package hw11Abstraction;

//(a) University - An Interface
//one keyword "extends" is used for the inheritance in interface
//An Interface can inherit multiple  Interfaces by "extends" keyword
//public interface University extends College, Hospital, AeronauticalSchool, LawSchool, VocationalSchool {
//An Interface can't inherit a regular class or an abstract class by "extends" keyword
//public interface University extends MedicalSchool {Interface can not inherit a regular class by "extends" keywords 
//public interface University extends MedicalSchool {Interface can not inherit an abstract class by "extends" keywords 
/*
 * Interface use only one keyword "extends" for inheritance
 * implements keyword can't be used for inheritance inside Interface
 */
public interface University extends College , Hospital {

	// methods declared
	public void classSize();

	public void playGround();

	public void teacher();

//		public University();  // default Constructor
//		we can not created default Constructor inside the interface
//		interface cannot have Constructor
	public default void gymnasium() { // default method created
		System.out.println("This is from default method");

	}

	public static void library() {// static method created
		System.out.println("This is from static method");

	}

}
