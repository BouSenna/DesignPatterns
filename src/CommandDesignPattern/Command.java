package CommandDesignPattern;

public class Command implements ICommand {
	Receiver mReceiver;

	public Command(Receiver receiver) {
		this.mReceiver = receiver;
	}

	@Override
	public void execute() {
		mReceiver.performActionA();
	}

	@Override
	public void undo() {
		mReceiver.performActionB();
	}

}
