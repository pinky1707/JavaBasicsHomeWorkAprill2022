package hw09Abstraction;

//b 

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public default void morgue() { // default method created

	}

	public static void pharmacy() { // static method created

	}

}
