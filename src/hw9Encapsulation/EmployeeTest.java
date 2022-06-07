package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Pinky Saha");
		employee.setAge(33);
		employee.setSex('F');
		employee.setUsCitizen(true);

		System.out.println("Employee name :" + employee.getName() + "\nEmployee age is :" + employee.getAge()

				+ "\nEmployee sex:" + employee.getSex() + "\nIs Us Citizen? Ans:" + employee.isUsCitizen());

	}

}
