package hw10UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {
		System.out.println("\n<..Default constructor initialized from Daughter class....>\n");
		Daughter daughter = new Daughter();

		System.out.println("\n<..Parameterized constructor initialized from Daughter class....>\n");
		Daughter obj1 = new Daughter("June", 33);

		System.out.println("\n<...void type method initialized from Daughter Class.....>\n");
		obj1.daughter();

		System.out.println("\n<...void type parameterized method initialized from Daughter Class.....>\n");
		obj1.daughter("January", 28);

		System.out.println("\n<...Default constructor initialized from Father Class.....>\n");
		Father father = new Father();
		
		System.out.println("\n<...Parameterized constructor initialized from Father Class.....>\n");
		Father obj2 = new Father("Shambu Nath Sarker", 62, 'M', false);

		System.out.println("\n<...void type method initialized from Father Class.....>\n");
		obj2.father();

		System.out.println("\n<...void type parameterized method initialized from Father Class.....>\n");
		obj2.fatherInfo("Arojit Pronoy", 22, 'M', true);

	}

}
