package hw11Abstraction;

//c
public interface College {
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void methodRoom() { // default method created

	}

	public static void studyRoom() { // static method created
		System.out.println("Hello");

	}

}
