package hw11Polymorphism;

public class Niece extends Sister {
// method 01 
	@Override
	public void sister(int age1, int age2, int age3, int age5, int age6) {
		System.out.println("This is from void type parameterized method");

	}

//	return type parameterized method 02 implemented
	@Override
	public int sister(int age1, int age2, int age3) {
		int total1 = age1 + age2 + age3 + 5;
		System.out.println("The total age from sister:" + total1);
		return total1;

	}

//	method 03 
	@Override
	public int sister(int age1, int age2, int age3, String age4) {
		int total2 = age1 + age2 + age3 + Integer.parseInt(age4) * 2;
		System.out.println("The total age from sister:" + total2);
		return total2;
	}
	
//	method 04
	@Override
	public int sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total3 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6 + 2;
		System.out.println("The total age from sister:" + total3);
		return total3;

	}

//	static type method 05 
//The method sister can't override or implemented
// because static is a local method of a class)
// So, static method can't be override, if we remove @override it will work as
// static method of this Niece class
//@Override
//	public static int sister(int age1, int age3, String age4, int age5, int age6, int age2) {
//
//		int total2 = age1 + age3 + Integer.parseInt(age4) + age5 + age6 + age2;
//		System.out.println("The total age from sister:" + total2);
//		return total2;
//	}

//	final type method 06
//	final type method can not be override
//public final int sister(int age1, int age2, int age3, int age5) {
//		int total3 = age1 + age2 + age3 + age5;
//		System.out.println("The total age from sister:" + total3);
//		return total3;
//	}

//	method 07
	@Override
	public void sister() {
		System.out.println("This is from void type method from sister");

	}

}
