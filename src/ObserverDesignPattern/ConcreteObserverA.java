package ObserverDesignPattern;

public class ConcreteObserverA implements IObserver {

	@Override
	public void update() {
		System.out.println("Observer A is notified.");
	}
}
