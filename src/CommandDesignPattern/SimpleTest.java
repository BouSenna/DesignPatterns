package CommandDesignPattern;

public class SimpleTest {
	public static void main(String[] args) {
		ICommand myCommand = new Command(new Receiver());
		Invoker invoker = new Invoker();
		invoker.setCommand(myCommand);
		invoker.executeCommand();
		invoker.unexecuteCommand();
	}
}
