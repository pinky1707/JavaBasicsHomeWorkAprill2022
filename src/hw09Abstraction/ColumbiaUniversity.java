//public class ColumbiaUniversity extends MedicalSchool{
// A regular class can not inherit a abstract class
//public class ColumbiaUniversity extends College {
// A regular class can not inherit an Interface
//public class ColumbiaUniversity extends RockefellerUniversity, NYUniversity {
//A regular class can not inherit more than one class by "extends" keywords
//public class ColumbiaUniversity extends RockefellerUniversity, NYUniversity {
//A regular class can inherit one class by "extends" keywords
package hw09Abstraction;

public class ColumbiaUniversity extends RockefellerUniversity {

//public abstract void chemistry(); //	abstract method 

	public void biology() { // non abstract method
		System.out.println("This comment is from non abstract method biology");

	}
//Q- can we create an abstract method in a regular class?Ans-
//	we can not create an abstract method in a regular class 
//abstract method can only be defined by an abstract class

	public ColumbiaUniversity() { // default Constructor created

	}

}
