package ObserverDesignPattern;

public class ConcreteObserverB implements IObserver {

	@Override
	public void update() {
		System.out.println("Observer B is notified.");
	}

}
