package CommandDesignPattern;

public class Invoker {
	ICommand mCommand;

	public Invoker() {
	}

	public void setCommand(ICommand command) {
		this.mCommand = command;
	}

	public void executeCommand() {
		this.mCommand.execute();
	}

	public void unexecuteCommand() {
		this.mCommand.undo();
	}

}
