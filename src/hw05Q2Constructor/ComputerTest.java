package hw05Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		// default Constructor initialized
		Computer computer = new Computer();
		// parameterized Constructor initialized
		Computer computer1 = new Computer("Apple ", "MacBook Air ", "MacOS Mojave ", 800, 'A', false);
		// parameterized Constructor initialized
		Computer myConfig = new Computer("Asus ", "Ryzen ", 600, "Windows ", 'B', true);

	}

}
