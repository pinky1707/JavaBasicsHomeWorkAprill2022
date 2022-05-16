/*
 * Create a package name "hw3JavaVariables" inside the Home work project, Create a Class name "AboutMe". Declare one type of variable(only one, so you know declare vs initialize), and initialize String and other 8 types of variable (you can try to give a different name from mine). Instantiate AboutMe class under main method and call few variables (not all) by object (you can use String concatenation to make it more meaningful outcome). Give a single line comment where a variable is declared and where initialized (Example: // Variable declared). Follow indentation by Organizing the code and paste below.
 */
package hw3JavaVariables;

public class AboutMe {

	// variable declared.
	public byte weight;

	// Variable initialized
	public String name = "Pinky Saha";
	// Variable initialized
	public byte age = 33;
	// Variable initialized
	public short home_address = 32027;
	// Variable initialized
	public int cell_number = 929282555;
	// Variable initialized
	public long salary = 13098764322l;
	// Variable initialized
	public float height = 5.2f;
	// Variable initialized
	public double grade = 4.69;
	// Variable initialized
	public char sex = 'F';
	// Variable initialized
	public boolean employment_status = false;

	public static void main(String[] args) {

		AboutMe pinky = new AboutMe();
		
		System.out.println("My Name is = " + pinky.name + "\nMy Age is = " + pinky.age + "\nMy cell number is = "
				+ pinky.cell_number + "\nMy grade is = " + pinky.grade + "\nMy Gender is = " + pinky.sex
				+ "\nMy employment status is = " + pinky.employment_status);
	}

}