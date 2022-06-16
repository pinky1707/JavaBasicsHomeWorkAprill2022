package hw11Polymorphism;



public class TestFamily {
	public static void main(String[] args) {
		System.out.println("\n............Sister Class.................");
		Sister obj = new Sister();

		obj.sister(20, 25, 28, 32, 35);// void type parameterized 01 initialized
		obj.sister(20, 25, 28);// return type parameterized 02 initialized
		obj.sister(20, 25, 28, "30");// return type parameterized 03 initialized
		obj.sister(20, 25, 28, "30", 32, 35);// return type parameterized 04 initialized
		Sister.sister(20, 28, "30", 32, 35, 25);// static type method 05 initialized
		obj.sister(20, 25, 28, 32);// final type method 06 initialized
		obj.sister(); // void type method 07 initialized
		
		System.out.println("\n .................Niece class......");
		Niece obj1= new Niece();
		obj1.sister(20,25,28,32,35); //void type parameterized 01 initialized
		obj1.sister(20,25,28); //return type parameterized 02 initialized
		obj1.sister(20,25,28,"30"); // return type parameterized 03 initialized
		obj1.sister(20,25,28,"30",32,35); // return type parameterized 04 initialized
		obj1.sister(); //void type method 07 initialized
//now adding to github
		

	}

}
