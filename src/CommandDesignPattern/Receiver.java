package CommandDesignPattern;

public class Receiver {
	public void performActionA() {
		System.out.println("The command is executed.");
	}

	public void performActionB() {
		System.out.println("The command is unexecuted.");
	}
}
