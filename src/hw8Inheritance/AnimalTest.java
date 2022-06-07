package hw8Inheritance;
/*
 * Create a package name "hw8Inheritance" in HW project. Inside the package, a) Create a class "Animal". Implement a method inside the Animal class -- animalInfo and System.out.println("This method is from Animal Class"). b) Create another class "Mammal". Implement a method inside the class -- mammalInfo and System.out.println("This method is from Mammal Class"). c) Create another class "Reptile". Implement a method inside the class -- reptileInfo and System.out.println("This method is from Reptile Class").   d) Create another class "Birds". Implement a method inside the class -- birdsInfo and System.out.println("This method is from Birds Class"). e) Create another class "Dog". Implement a method inside the class -- dogInfo and System.out.println("This method is from Dog Class"). f) Create another class "Snake". Implement a method inside the class -- snakeInfo and System.out.println("This method is from Snake Class"). g) Create another class "Robin". Implement a method inside the class -- robinInfo and System.out.println("This method is from Robin Class"). h) Create another class "BullDog". Implement a method inside the class -- bullDogInfo and System.out.println("This method is from BullDog Class"). i) Create another class "Cobra". Implement a method inside the class -- cobraInfo and System.out.println("This method is from Cobra Class"). Now create a class "AnimalTest". Under the main method create an object from each class and call their own method by their own object first. Now extends BullDog, Cobra, and Robin class to their parents class and shows their hierarchy till Animal Class, for example: bulldog -- dog -- mammal --Animal, Cobra -- snake--reptile--Animal, Robin -- Bird -- Animal etc. We know, An object Can call other methods if the class is extended, if yes, show all the possible calls. Use Java comments to show single inheritance, multilevel inheritance, Hierarchical inheritance by example form the above. Also, show by java comments who is Parent class and who is child class for at least one class. Organize the code. Push the code in Github. Paste your github link below.

 */

public class AnimalTest {
//	here Animal class is the parent class of Mammal,Reptile & Birds.
//	Mammal,Reptile & Birds is child of Animal class. 
//	Mammal is a parent class of Dog so Dog is a child class of Mammal.
//	Dog is a parent class of BullDog so BullDog is a child class of Dog.
//	Reptile is parent class of Snake so Snake is a child class of Reptile.
//	Snake is a parent class of Cobra so Cobra is a child class of Snake.
//	Birds is a parent class of Robin so Robin is a child class of Birds.
//	multilevel inheritance is not allowed in Java.
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		System.out.println("\n----------------------------------------------------\n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
		// yes object can call other methods if the class is extended.

		System.out.println("\n----------------------------------------------------\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		// yes object can call other methods if the class is extended.

		System.out.println("\n----------------------------------------------------\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		// yes object can call other methods if the class is extended.

		System.out.println("\n----------------------------------------------------\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		// yes object can call other methods if the class is extended.

		System.out.println("\n----------------------------------------------------\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		// yes object can call other methods if the class is extended.

		System.out.println("\n----------------------------------------------------\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		// yes object can call other methods if the class is extended.

		System.out.println("\n----------------------------------------------------\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		// yes object can call other methods if the class is extended.

		System.out.println("\n----------------------------------------------------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		// yes object can call other methods if the class is extended.

	}

}
