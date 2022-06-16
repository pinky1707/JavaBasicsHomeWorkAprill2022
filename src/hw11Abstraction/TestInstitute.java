/*
 * TestInstitute. Then Instantiate  ColumbiaUniversity , University and MedicalSchool one by one. Call all the possible methods from the object of ColumbiaUniversity , University and MedicalSchool. Make sure you execute the static methods from ColumbiaUniversity , University and MedicalSchool (if not created, please create one). Try to create default method (public default void ...........[follow the format of default method from interface]) in regular class and abstract c
 */

package hw11Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		System.out.println("\n.....................Regular Class ColumbiaUniversity.............");
		ColumbiaUniversity cu = new ColumbiaUniversity();
		ColumbiaUniversity.biology1();// if a method is static, no need to create object, the class can directly call
										// it.
		cu.biology();
		cu.classSize();// here classSize is overridden
		cu.playGround();
		cu.teacher();
		cu.anatomyLab();
		cu.vocationalSchool();
		cu.lawInfo();
		cu.hygine();
		cu.commonRoom();
		cu.laboratory();
		cu.languageClub();
		cu.emergencyRoom();
		cu.surgeryRoom();
		cu.cafeteria();
		cu.gymnasium();
		ColumbiaUniversity.library();// library is a static method in Abstract class,ColumbiaUniversity extends that
										// Abstract class,
		// so, ColumbiaUniversity itself can initialize that method.

		System.out.println("/n................Interface University...............");
		// an Interface can't be instantiated, it needs the help of a concrete class,
		// here ColumbiaUniversity is the concrete class
		University us = new ColumbiaUniversity();
		us.classSize();
		us.playGround();
		us.teacher();
		us.gymnasium();
		ColumbiaUniversity.library();
		// ColumbiaUniversity.studyRoom();
		// ColumbiaUniversity.pharmacy();
		// Interface can not call inherited class's static method
		us.commonRoom();
		us.laboratory();
		us.languageClub();
		us.methodRoom();

		System.out.println("\n.............Abstract class Medicalschool..............");
		// an abstract class can't be instantiated, it needs the help of a concrete
		// class, here ColumbiaUniversity is the concrete class
		MedicalSchool ms = new ColumbiaUniversity();
		ms.anatomyLab();
		ms.biochemistry();
		MedicalSchool.medicalSchool();
		ms.hygine();
		ms.lawInfo();
		ms.caring();
		ms.aeronauticallInfo();
		ms.mechanicalLab();

	}
}
