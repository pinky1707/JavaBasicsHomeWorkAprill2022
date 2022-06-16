//public class ColumbiaUniversity extends MedicalSchool{

// A regular class can not inherit a abstract class
//public class ColumbiaUniversity extends College {
// A regular class can not inherit an Interface
//public class ColumbiaUniversity extends RockefellerUniversity, NYUniversity {
//A regular class can not inherit more than one class by "extends" keywords
//public class ColumbiaUniversity extends RockefellerUniversity, NYUniversity {
//A regular class can inherit one  regular class by "extends" keyword
/*
 * A regular class can inherit one abstract class by "extends" keyword
 *  implements keyword is used to inherit Interface in regular class
 *  a regular class can inherit more than one Interface
 *  a regular class cannot inherit a regular class or abstract class by implements keyword

 */
package hw11Abstraction;
 
//public class ColumbiaUniversity extends RockefellerUniversity {
 public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	 

//public abstract void chemistry(); //	abstract method 

	public void biology() { // non abstract method
		System.out.println("This comment is from non abstract method biology");

	}
	public static void biology1() {
		System.out.println("This is a static method  ");
		
	}
//Q- can we create an abstract method in a regular class?Ans-
//	we can not create an abstract method in a regular class 
//abstract method can only be defined by an abstract class

	public ColumbiaUniversity() { // default Constructor created

	}
@Override
public void classSize() {
	// TODO Auto-generated method stub
	
}
@Override
public void playGround() {
	// TODO Auto-generated method stub
	
}
@Override
public void teacher() {
	// TODO Auto-generated method stub
	
}
@Override
public void anatomyLab() {
	// TODO Auto-generated method stub
	
}
@Override
public void vocationalSchool() {
	// TODO Auto-generated method stub
	
}

@Override
public void lawInfo() {
	// TODO Auto-generated method stub
	
}

@Override
public void hygine() {
	// TODO Auto-generated method stub
	
}

@Override
public void commonRoom() {
	// TODO Auto-generated method stub
	
}

@Override
public void laboratory() {
	// TODO Auto-generated method stub
	
}

@Override
public void languageClub() {
	// TODO Auto-generated method stub
	
}

@Override
public void emergencyRoom() {
	// TODO Auto-generated method stub
	
}

@Override
public void surgeryRoom() {
	// TODO Auto-generated method stub
	
}

@Override
public void cafeteria() {
	// TODO Auto-generated method stub
	
}

public static void library() {
	// TODO Auto-generated method stub
	
}

}
